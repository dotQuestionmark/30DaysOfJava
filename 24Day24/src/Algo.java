package algos;

import java.util.Random;

public class Algo {
	private Board board;
	private int runCounter; // count attempts till finish
	private int queensCounter;
	private boolean[] usedRows; // check if 1 row doesn't have more than 1 queen
	private static Random rand;

	public Algo() {
		rand = new Random();
		board = new Board();
		usedRows = new boolean[8];
		runCounter = 0;
		queensCounter = 0;
	}

	public void PlaceQueens() {// method to place the queens in their next empty position
		board.fillboard();
		do {
			SetPositions();
			System.out.println(runCounter);
		} while (!isWinner());// is winner method here for validation

		System.out.println("It took " + runCounter + " attempts to make the queens set up correctly");
	}

	public boolean isWinner() {
		board.displayBoard();
		System.out.println();
		int attackingQueenCounter = 0;
		for (int c = 0; c < 7; c++) {
			for (int r = 0; r <= 7 - c; r++) {
				if (board.board[r][c + r] != Board.BOARD_CHAR) {
					attackingQueenCounter++;
					if (!countQueens(attackingQueenCounter))
						return false;
				}
			}
			attackingQueenCounter = 0;
		}

		attackingQueenCounter = 0;// if not reinitialized the attacking counter to 0
		for (int r = 0; r < 7; r++) {
			for (int c = 7; c >= r; c--) {
				if (board.board[7 - c + r][c] != Board.BOARD_CHAR) {
					attackingQueenCounter++;
					if (!countQueens(attackingQueenCounter))
						return false;
				}
			}
			attackingQueenCounter = 0;
		}

		attackingQueenCounter = 0;
		for (int c = 7; c > 0; c--) {
			for (int r = 7; r >= 7 - c; r--) {
				if (board.board[r][c + r - 7] != Board.BOARD_CHAR) {
					attackingQueenCounter++;
					if (!countQueens(attackingQueenCounter))
						return false;
				}
			}
			attackingQueenCounter = 0;
		}

		attackingQueenCounter = 0;
		for (int r = 7; r > 0; r--) {
			for (int c = 0; c <= r; c++) {
				if (board.board[r - c][c] != Board.BOARD_CHAR) {
					attackingQueenCounter++;
					if (!countQueens(attackingQueenCounter))
						return false;
				}
			}
			attackingQueenCounter = 0;
		}

		return true;
	}

	private boolean countQueens(int attackingQueenCounter) {// method to keep a track of number of queens we are placing
		if (attackingQueenCounter > 1) {
			queensCounter = 0;
			usedRows = new boolean[8];
			board.fillboard();
			return false;
		}
		return true;
	}

	public void SetPositions() {// method to set position
		int col = 0;
		int row = 0;

		while (queensCounter < 8) {
			row = rand.nextInt(8);
			if (isValidRow(row)) {
				board.board[row][col] = Board.QUEEN_CHAR;
				col++;
				queensCounter++;
			}
		}
		runCounter++;
	}

	public boolean isValidRow(int row) {
		if (!usedRows[row]) {
			usedRows[row] = true;
			return true;
		}

		return false;
	}
}

