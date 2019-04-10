import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread{
	DataInputStream dis;
	DataOutputStream dos;
	String serverName;
	Socket serverSocket;
	int serverPort;
	ServerSocket connexionSocket;
	InetAddress adress;
	
	public SocketServer(String serverName ,int serverPort,int backlock,InetAddress adress) {
		this.serverName = serverName;
		this.serverPort = serverPort;
		try {
			
		}catch(Exception e){
			try {
				connexionSocket=new ServerSocket(serverPort, backlock, adress.getLocalHost());
				connexionSocket.setSoTimeout(20000000);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

	@Override
	public synchronized void run() {
		try {
			System.out.println(serverName +" starting ...");
			System.out.println(serverName+" waiting for connexion");
			System.out.println(serverSocket);
			serverSocket=connexionSocket.accept();
			dos=new DataOutputStream(serverSocket.getOutputStream());
			dos.writeChars(serverName +" welcome your are connected");
			dos.writeChars("what should i call you");
			dos.flush();
			BufferedReader buff=new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
			String response =buff.readLine();
			System.out.println(serverName +": welcome " + response);
		}catch(Exception e) {
			
		}
	}
	
	

}
