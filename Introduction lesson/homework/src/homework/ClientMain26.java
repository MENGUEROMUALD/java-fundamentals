package homework;

import java.io.IOException;

public class ClientMain26 {

	public static void main(String[] args) {

		SocketClient27 client = null;
		try {
			client = new SocketClient27("Client", 5505);
			client.connect();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
