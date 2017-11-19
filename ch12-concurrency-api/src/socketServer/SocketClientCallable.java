package socketServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class SocketClientCallable implements Callable<SocketBean> {

	private SocketBean bean;
	
	public SocketClientCallable(SocketBean bean) {
		this.bean = bean;
	}
	
	@Override
	public SocketBean call() throws IOException {
		try(Socket sock = new Socket(bean.host, bean.port)) {
			Scanner scanner = new Scanner(sock.getInputStream());
			bean.feedback = scanner.next();
			return bean;
		} 
	}
	
}
