import java.util.Scanner;

public class seatingarr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// ask for number of inputs
		int x = in.nextInt();
		// for loop
		for (int i = 0; i < x; i++) {
			// input the number of seat
			int seat = in.nextInt();
			// calculating the facing seat number
			seat = seat + 2 * (6 - (seat - 1) % 12) - 1;
			// checking the seat type
			if (seat % 6 < 2)
				System.out.println(seat + " " + "WS");
			else if (seat % 6 == 2 || seat % 6 == 5)
				System.out.println(seat + " " + "MS");
			else
				System.out.println(seat + " " + "AS");
		}
	}
}
