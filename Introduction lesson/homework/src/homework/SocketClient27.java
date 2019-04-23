package homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

// run at clientmain26
// while socket server run at networkpmain.

public class SocketClient27 {
	
	Socket clientSocket;
	int clientPort;
	String clientName;

	public SocketClient27(String string, int i) throws UnknownHostException, IOException {
		clientName = string;
		clientSocket = new Socket(InetAddress.getLocalHost(), i);
	}

	public void connect() throws IOException {
		//Send name to server socket
		DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
				dos.writeChars(clientName);
		
		//recieve response
		DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
		String response = dis.readUTF();
		System.out.println(response);
		
		try {
			System.out.println(clientName+" : Connected. " );
		}
		finally {
			if (dis != null)
				try {
					dis.close();
				}
			catch (IOException e) {
				e.printStackTrace();
			}
			if (dos != null)
				try {
					dos.close();
				}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
