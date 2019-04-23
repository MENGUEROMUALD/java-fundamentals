package homework;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer26 extends Thread{
	
	String servername;
	Socket serversocket;
	int serverport;
	ServerSocket connectionSocket;
	
	public SocketServer26(String name, int port) {
		servername = name;
		serverport = port;
		try {
			connectionSocket = new ServerSocket(serverport, 2, InetAddress.getLocalHost());
			//connectionSocket.setSoTimeout(10000);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public synchronized void run() {
		// Starts the server
		try {
			System.out.println(servername+ " : Starting....");
			System.out.println(servername+" : Started. Waiting for connections on port "+connectionSocket.getLocalPort());
			serversocket = connectionSocket.accept();
			System.out.println(serversocket);
			
			//Send greeting to client Socket
			DataOutputStream dos = new DataOutputStream(serversocket.getOutputStream());
			dos.writeChars(servername+" Welcome ! you are now connected");
			dos.writeChars("What should I call you?\n");
			dos.flush();
			
			//recieve response
			BufferedReader bReader = new BufferedReader(new InputStreamReader(serversocket.getInputStream()));
			String response = bReader.readLine();
			System.out.println(servername+" welcome! "+response);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
