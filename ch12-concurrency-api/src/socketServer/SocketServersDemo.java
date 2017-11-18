package socketServer;

public class SocketServersDemo {

	public static void main(String[] args) {
		for(int port = 10000; port < 10005; port++) {
			new Thread(new SocketServer(port)).start();
		}
	}

}
