import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocketServer sock = null;
		try {
			sock = new SocketServer("ndeme yvan server",8080,2,InetAddress.getLocalHost());
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sock.run();
	}

}
