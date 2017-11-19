package socketServer;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer implements Runnable {

	int port;
	
	public SocketServer(int port) {
		this.port = port;
	}
	
	@Override
	public void run() {
		System.out.println("server " + port + ": listening...");
		while(true) {
			try {
				//listen on port
				ServerSocket serverSock = new ServerSocket(port);
				
				//get connection
				Socket clientSock = serverSock.accept();
				
				//sleep for 5 seconds
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//feedback and output
				PrintWriter pw = new PrintWriter(clientSock.getOutputStream(), true);
				pw.println("feedback_from_server_" + port);
				
				//close
				serverSock.close();
				clientSock.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
