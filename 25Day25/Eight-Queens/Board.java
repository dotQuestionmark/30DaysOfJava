package algos;

public class Board {
	public static final char BOARD_CHAR = '.';
	public static final char QUEEN_CHAR = 'X';
	public char[][] board;

	public Board() {
		board = new char[8][8];
	}

	public void displayBoard() {// function to display the board
		for (int i = 0; i < 8; i++) {
			for (int c = 0; c < 8; c++) {
				System.out.print(board[i][c] + "  ");
			}
			System.out.println();
			System.out.println();
		}
	}

	public void fillboard()// fill the empty board with dots so that we can keep a check on queens that we
							// are placing
	{
		for (int i = 0; i < 8; i++) {
			for (int c = 0; c < 8; c++) {
				board[i][c] = BOARD_CHAR;
			}
		}
	}
}
