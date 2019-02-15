package ExerciceThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	ServerSocket socketServer;
	Socket socketDuServer;
	 BufferedReader in;//pour prendre les entrer du joue
	 PrintWriter out;//pour envoyer
	Scanner input= new Scanner(System.in);
	// pour prendre les lancer de de
	
	public void connectGame() throws IOException {
	socketServer = new ServerSocket(2019);
	socketDuServer= socketServer.accept();
	out = new PrintWriter(socketDuServer.getOutputStream());
	//in = new BufferedReader(new InputStreamReader(new socketDuServer.getInputStream()));
	}
	
}
				



 
