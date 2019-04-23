package homework;

import java.io.IOException;

public class NetworkPMain {

	public static void main(String[] args) {
		
		SocketServer26 server = new SocketServer26(" Server", 5505);
		server.run();
		
		
	}

}
