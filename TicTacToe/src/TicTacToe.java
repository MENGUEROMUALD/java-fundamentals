
public class TicTacToe {
	char [][] board ;
	int plays;
	public  TicTacToe(int boardSize) {
		plays = boardSize*boardSize;
		board = new char [boardSize][boardSize];
		//initialize the playing board to a square matrix;
		for (int i =0;i<board.length;i++){
			for(int j=0;j<board[i].length;) {
				board[i][j++]=' ';
			}
		}
	}
	//make a play/move from this player
	public boolean play(int index,int end, Player player) {
		try {
			if(plays==0){
				//game over,no more place to plays
				printBoard();
				return false;
			}
			if(board[index][end]==' ') {
				board[index][end]=player.seed;
				plays--;
				boolean gameOver = checkBoard(player);
				printBoard();
				return gameOver;
			}else {
				System.out.println("entry occupied,please play elseWhere .");
				printBoard();
				return false;
			}
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("invalid index");
			return false;
		}
	}
	
	private boolean checkBoard(Player player) {
		boolean isLine = true ;
		//testing horizontal lines/betwen adjacent vertical
		for(int i=0;i<board.length;i++) {
			isLine=true;
			for(int j=0;j<board[i].length;) {
				if(board[i][j++]!=player.seed) {
					isLine&=true;
					break;
				}
				
			}
			if(isLine)
				break;
		}
		if(isLine) {
			player.setPoints(board.length*2);
			return isLine;
		}
		//testing line/edges between adjacent vertical
		for(int i=0;i<board.length;i++) {
			isLine=true;
			for(int j =0;j<board[i].length;) {
				if(board[j++][i]!=player.seed) {
					isLine &= false;
					break;
				}
			}
			if(isLine)
				break;
		}
		if(isLine) {
			player.setPoints(board.length*2);
			return isLine;
		}
		//testing of diagonal line/edge
		for(int i=0;i<2;i++) {
			isLine=true;
			for(int j=0;j<board[i].length;) {
				if(board[j][j++]!=player.seed) {
					isLine&=false;
					break;
				}
			}
			if(isLine)
				break;
		}
		if(isLine) {
			player.setPoints(board.length*2);
		}
		//testing diagonal
		isLine=true;
		for(int j=0,i=board.length-1;j<board.length;) {
			if(board[j++][i--]!=player.seed) {
				isLine&=false;
				break;
			}
		}
			
	if(isLine) {
		player.setPoints(board.length*2);
		return isLine;
	}
	return isLine;
	}
	public int getPlays() {
		return plays;
	}
	public void printBoard() {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) 
				System.out.println("| " + board[i][j]);
				System.out.println("|\n");
				for(int j=0;j<board[i].length;j++) 
					System.out.println("_ _");
				System.out.println();
		}
		System.out.println("=========");
	}
}
