package krpc.test.rpc.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxx.userservice.proto.LoginReq;
import com.xxx.userservice.proto.LoginRes;
import com.xxx.userservice.proto.UserService;
import com.xxx.userservice.proto.UserServiceAsync;

import krpc.rpc.bootstrap.RpcApp;

public class RpcClientTest {

	static Logger log = LoggerFactory.getLogger(RpcClientTest.class);
	
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

		// user code
		
		RpcApp app = (RpcApp)context.getBean("app");
		UserService us = (UserService)context.getBean("userService");
		UserServiceAsync usa = (UserServiceAsync)context.getBean("userServiceAsync");

		LoginReq req = LoginReq.newBuilder().setUserName("abc").setPassword("mmm").build();
		LoginRes res = us.login(req);
		log.info("res="+res.getRetCode()+","+res.getRetMsg());

		// user code end
		
		Thread.sleep(15000);

		context.close();
        ((ch.qos.logback.classic.Logger) log).getLoggerContext().stop();		
	}	
		
}

