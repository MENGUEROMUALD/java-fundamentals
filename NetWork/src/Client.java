import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	DataInputStream dis;
	DataOutputStream dos;
	public void connect() {
		try {
			Socket clientSocket = new Socket("localHost",8080);
			System.out.println("client connected : ");
			 dos =new DataOutputStream(clientSocket.getOutputStream());
			dos.writeChars("ndeme connected");
			 dis = new DataInputStream(clientSocket.getInputStream());
			String response = dis.readUTF();
		}catch(Exception e) {
			
		}finally {
			if(dis!=null) {
				try {
					dis.close();
				}catch(Exception e) {
					
				}
			}
			if(dos!=null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
