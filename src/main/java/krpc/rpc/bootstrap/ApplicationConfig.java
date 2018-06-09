package krpc.rpc.bootstrap;

public class ApplicationConfig  {

	String name = "unknown";
	String traceAdapter = "default"; // default, skywalking, zipkin, cat
	String errorMsgConverter = "file";
	String mockFile = "";
	
	String dataDir = ".";

	public ApplicationConfig() {
	}

	public ApplicationConfig(String name) {
		this.name = name;
	}

	public String getMockFile() {
		return mockFile;
	}

	public ApplicationConfig setMockFile(String mockFile) {
		this.mockFile = mockFile;
		return this;
	}

	public String getName() {
		return name;
	}

	public ApplicationConfig setName(String name) {
		this.name = name;
		return this;
	}

	public String getErrorMsgConverter() {
		return errorMsgConverter;
	}

	public ApplicationConfig setErrorMsgConverter(String errorMsgConverter) {
		this.errorMsgConverter = errorMsgConverter;
		return this;
	}

	public String getTraceAdapter() {
		return traceAdapter;
	}

	public ApplicationConfig setTraceAdapter(String traceAdapter) {
		this.traceAdapter = traceAdapter;
		return this;
	}

	public String getDataDir() {
		return dataDir;
	}

	public ApplicationConfig setDataDir(String dataDir) {
		this.dataDir = dataDir;
		return this;
	}

}

