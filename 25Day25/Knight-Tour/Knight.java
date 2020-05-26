package knighttour;

import java.util.Random;

public class Knight {
	private static Random rand = new Random();
	private int curH;
	private int curV;
	private Board board;
	private boolean isFullTour = false;
	private boolean isEndTour = false;
	private static int bestScore = 0; // stores the most number of moves made in one tour so far
	private static int tourCount = 0; // counts all incomplete tours
	private int moveCounter;

	public Knight() {
		board = new Board();
	}

	private void getTourResults() {
		isEndTour = true;
		if (moveCounter == Board.SIZE * Board.SIZE) {
			isFullTour = true;
			board.DisplayBoard();
			System.out.println(
					"SUCCESS. The Tour #" + tourCount + " was a complete tour!\n" + "The best socre is: " + bestScore);
			return;
		}

		if (moveCounter == bestScore) {
			board.DisplayBoard();
			System.out.println("No success. The best score is still " + bestScore
					+ " moves reached again on this Tour #" + tourCount + "\n");
		} else if (moveCounter > bestScore) {
			bestScore = moveCounter;
			board.DisplayBoard();
			System.out.println(
					"No success, but getting closer! " + bestScore + " moves reached on Tour #" + tourCount + "\n");
		}
	}

	public void move() {
		while (!isFullTour) {
			curH = rand.nextInt(Board.SIZE);
			curV = rand.nextInt(Board.SIZE);
			moveCounter = 1;
			board.FillBoard(curH, curV);
			isEndTour = false;

			do {
				if (!isMoving())
					getTourResults();
			} while (!isEndTour);
		}
	}

	public boolean isMoving() {
		int[] movesTaken = { 0, 0, 0, 0, 0, 0, 0, 0 };
		boolean allMovesUsed = false;

		while (!allMovesUsed) {
			int i = rand.nextInt(8);
			if (movesTaken[i] == 0) {
				int hMove = curH + board.getHorizontal(i);
				int vMove = curV + board.getVertical(i);
				if (hMove >= 0 && hMove < Board.SIZE && vMove >= 0 && vMove < Board.SIZE
						&& Board.chessBoard[hMove][vMove] == Board.BOARD_SYMBOL) {
					curH = hMove;
					curV = vMove;
					Board.chessBoard[curH][curV] = Board.MOVE_SYMBOL;
					moveCounter++;
					return true;
				}

				movesTaken[i] = 1;
			}

			int c = 0;
			for (int moves : movesTaken) {
				c += moves;
			}

			if (c == 8)
				allMovesUsed = true;
		}

		tourCount++;
		return false;
	}
}

