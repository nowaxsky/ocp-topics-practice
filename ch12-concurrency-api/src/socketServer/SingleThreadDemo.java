package socketServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * run SocketServersDemo before running this class
 */
public class SingleThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("SingleThread starts at: " + new Date());
		String host = "localhost";
		
		for(int port = 10000; port < 10005; port++) {
			
			SocketBean bean = new SocketBean(host, port);
			try(Socket sock = new Socket(bean.host, bean.port);
				Scanner scanner = new Scanner(sock.getInputStream())) {
				
				bean.feedback = scanner.next();
				System.out.println("Call " + bean.host + ":" + bean.port + ", and get: " + bean.feedback + " at " + new Date());
	
			} catch (NoSuchElementException | IOException e) {
				System.out.println("Error talking to " + host + ":" + port);
			}
		}

	}

}
