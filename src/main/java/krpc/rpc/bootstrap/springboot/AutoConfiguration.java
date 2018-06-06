package krpc.rpc.bootstrap.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import krpc.rpc.bootstrap.Bootstrap;
import krpc.rpc.bootstrap.ClientConfig;
import krpc.rpc.bootstrap.RefererConfig;
import krpc.rpc.bootstrap.RegistryConfig;
import krpc.rpc.bootstrap.RpcApp;
import krpc.rpc.bootstrap.ServerConfig;
import krpc.rpc.bootstrap.ServiceConfig;
import krpc.rpc.bootstrap.WebServerConfig;
import krpc.rpc.bootstrap.spring.SpringBootstrap;

@Configuration
@EnableConfigurationProperties(BootProperties.class)
@ConditionalOnClass(Bootstrap.class) 
@ConditionalOnProperty  ( prefix = "krpc", value = "enabled", matchIfMissing = false )
public class AutoConfiguration  {

	static Logger log = LoggerFactory.getLogger(AutoConfiguration.class);
	
	@Bean
	static public BeanFactoryPostProcessor postProcessor() {
		return new BootPostProcessor();
	}

    @Bean(destroyMethod = "stopAndClose")
    @ConditionalOnMissingBean(RpcApp.class)
    public RpcApp rpcApp(BootProperties bootProperties,Environment environment,BeanFactory beanFactory) {	

    	Bootstrap bootstrap = SpringBootstrap.instance.getBootstrap();
		
    	if( bootProperties.application != null ) {
    		bootstrap.setAppConfig(bootProperties.application);
    	}
    	
        String springAppName = environment.getProperty("spring.application.name");
        if( !isEmpty(springAppName)) {
        	bootstrap.getAppConfig().setName(springAppName);
        }
        
    	if( bootProperties.monitor != null ) {
    		bootstrap.setMonitorConfig(bootProperties.monitor);
    	}

    	if( bootProperties.registry != null ) {
    		bootstrap.addRegistry(bootProperties.registry);
    	}
    	if( bootProperties.registries != null ) {
    		for(RegistryConfig c: bootProperties.registries)
    			bootstrap.addRegistry(c);
    	}

    	if( bootProperties.server != null ) {
    		bootstrap.addServer(bootProperties.server);
    	}
    	if( bootProperties.servers != null ) {
    		for(ServerConfig c: bootProperties.servers)
    			bootstrap.addServer(c);
    	}
    	
    	if( bootProperties.client != null ) {
    		bootstrap.addClient(bootProperties.client);
    	}
    	if( bootProperties.clients != null ) {
    		for(ClientConfig c: bootProperties.clients)
    			bootstrap.addClient(c);
    	}

    	String profile = environment.getProperty("spring.profiles.active");
    	
    	if( bootProperties.service != null ) {
    		ServiceConfig c = bootProperties.service;

			String impl = c.getImpl() == null ? null : c.getImpl().toString()  ;
			Object bean = loadBean(impl,c.getInterfaceName(),beanFactory);
			if( bean == null ) throw new RuntimeException("bean not found for service "+ c.getInterfaceName() );
			c.setImpl(bean);
			
			String group = c.getGroup();
	    	if( group == null || group.isEmpty()) {
	    		c.setGroup(profile);
	    	}
	    	
    		bootstrap.addService(c);
    	}    	
    	if( bootProperties.services != null ) {
    		for(ServiceConfig c: bootProperties.services) {
    			String impl = c.getImpl() == null ? null : c.getImpl().toString()  ;
    			Object bean = loadBean(impl,c.getInterfaceName(),beanFactory);
    			if( bean == null ) throw new RuntimeException("bean not found for service "+ c.getInterfaceName() );
    			c.setImpl(bean);
    			
    			String group = c.getGroup();
    	    	if( group == null || group.isEmpty()) {
    	    		c.setGroup(profile);
    	    	}
    	    	
    			bootstrap.addService(c);
    		}
    	}
    	
    	if( bootProperties.referer != null ) {
    		RefererConfig c = bootProperties.referer;
    		
			String group = c.getGroup();
	    	if( group == null || group.isEmpty()) {
	    		c.setGroup(profile);
	    	}
	    	
    		bootstrap.addReferer(c);
    	}    	
    	if( bootProperties.referers != null ) {
    		for(RefererConfig c: bootProperties.referers) {
    			
    			String group = c.getGroup();
    	    	if( group == null || group.isEmpty()) {
    	    		c.setGroup(profile);
    	    	}
    	    	
    			bootstrap.addReferer(c);
    		}
    	}
    	
    	if( bootProperties.webServer != null ) {
    		bootstrap.addWebServer(bootProperties.webServer);
    	}    	    	
    	if( bootProperties.webServers != null ) {
    		for(WebServerConfig c: bootProperties.webServers)
    			bootstrap.addWebServer(c);
    	}
				
		RpcApp app = bootstrap.build();
		app.init();
		
		SpringBootstrap.instance.setRpcApp(app);

		if( bootProperties.autoStart ) {
			app.start();
		}
		
		return app;
    }

    Object loadBean(String impl, String interfaceName,BeanFactory beanFactory) {
    	if( interfaceName == null ) return null;
    	
    	String beanName;
		if( impl != null && !impl.isEmpty()) {
			beanName = impl;
		} else {
			int p = interfaceName.lastIndexOf(".");
			if( p < 0 ) return null;
			String name = interfaceName.substring(p+1);
			beanName = name.substring(0,1).toLowerCase()+name.substring(1);
		}
		try {
			Object o = beanFactory.getBean(beanName);
			return o; 
		} catch(Exception e1) {
			try {
				Object o = beanFactory.getBean(Class.forName(interfaceName));
				return o;
			} catch(Exception e2) {
				return null;
			}
		}
	}
    
    boolean isEmpty(String s) {
    	return s == null || s.isEmpty();
    }

	static class BootPostProcessor implements BeanFactoryPostProcessor {
		
		@Override
		public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory0) throws BeansException {
			
			SpringBootstrap.instance.spring = beanFactory0;
			DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)beanFactory0;
			
			Environment environment = (Environment)beanFactory.getBean("environment");
			
			String s = environment.getProperty("krpc.referer.interfaceName");
			if( s != null ) {
				String id = environment.getProperty("krpc.referer.id");
				registerReferer(id,s,beanFactory);
			}
			
			for(int i=0;i<10000;++i) {
				s = environment.getProperty("krpc.referers["+i+"].interfaceName") ;
				if( s != null ) {
					String id = environment.getProperty("krpc.referers["+i+"].id") ;
					registerReferer(id,s,beanFactory);
				}
				else break;
			}
		}	
		
		void registerReferer(String id,String interfaceName,DefaultListableBeanFactory beanFactory) {
			String beanName = generateBeanName(id,interfaceName);
			log.info("register referer "+interfaceName+", beanName="+beanName);
	        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(RefererFactory.class);
	        beanDefinitionBuilder.addConstructorArgValue(beanName);
	        beanDefinitionBuilder.addConstructorArgValue(interfaceName);
	        beanDefinitionBuilder.addDependsOn("rpcApp");
	        beanDefinitionBuilder.setLazyInit(true);
	        beanFactory.registerBeanDefinition(beanName, beanDefinitionBuilder.getRawBeanDefinition());			
		}

		String generateBeanName(String id, String interfaceName) {
			if( id != null && !id.isEmpty()) return id;
			int p = interfaceName.lastIndexOf(".");
			String name = interfaceName.substring(p+1);
			name = name.substring(0,1).toLowerCase()+name.substring(1);
			return name;
		}

	}

}
