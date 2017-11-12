package socketServer;

public class SocketBean {

	public String host;		//IP
	public int port;		//port
	public String feedback;	//feedback message
	
	public SocketBean(String host, int port) {
		this.host = host;
		this.port = port;
	}
}
