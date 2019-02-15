import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameClient extends Thread {
	static Scanner input;
	static String[] board;
	static String turn;
	static ServerSocket ss;
	static Socket s;
	
	
	@Override
	public void run() {
		try {
			Socket s = new Socket(null, 2019);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = new Scanner(System.in);
			board = new String[9];
			turn = "X";
			String winner = null;
			System.out.println("Bienvenue sur TicTacToe 2 joueurs");
			System.out.println("--------------------------------");
			populateEmptyBoard();
			printBoard();
			System.out.println("X va jouer en premier. entrer le numero de votre choix : ");
			String entrer;
			String sortie;
			while (winner == null) {
				entrer=din.readUTF();
				System.out.println(entrer);
				sortie=br.readLine();
				dout.writeUTF(sortie);
				dout.flush();
				
				int numInput= Integer.parseInt(entrer) ;
				try {
					numInput = input.nextInt();
					
					if (!(numInput > 0 && numInput <= 9)) {
						System.out.println("Invalid ; veillez (re)entrer votre choix:");
						continue;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid ; veillez (re)entrer votre choix:");
					continue;
				}
				if (board[numInput-1].equals(String.valueOf(numInput))) {
					board[numInput-1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
					}
					printBoard();
					winner = checkWinner();
				} else {
					System.out.println("ce choix est deja pris ; veillez (re)entrer votre choix:");
					continue;
				}
			}
			
			s.close();
			
			if (winner.equalsIgnoreCase("null")) {
				System.out.println("match null! Thanks for playing.");
			} else {
				System.out.println("Felecitation! " + winner + " a gagne! Thanks for playing.");
			}
		}catch(Exception e){
			
		}
		

	}
	
	
	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + " de jouer; entrer le numero " + turn + " en:");
		return null;
	}

	
	static void printBoard() {
		System.out.println("----|---|----");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("----|---|----");
	}

	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}

}
