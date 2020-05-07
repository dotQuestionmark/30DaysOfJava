package DAY7;

import java.util.Scanner;

class trunkcall {
	public int duration;
	public int charges;

	trunkcall() {
		System.out.println("Enter Duration of call: ");
		Scanner in = new Scanner(System.in);
		duration = in.nextInt();
	}

	void charges(int rate) {
		charges = duration * rate;
		System.out.println("Charges are: " + charges);
	}
}

class ordinarytrunkcall extends trunkcall {
	public int rateofordinary;

	ordinarytrunkcall() {
		System.out.println("Enter rate of ordinary trunk call as per hour: ");
		Scanner in = new Scanner(System.in);
		rateofordinary = in.nextInt();
		charges(rateofordinary);
	}
}

class urgenttrunkcall extends trunkcall {
	public int rateofurgent;

	urgenttrunkcall() {
		System.out.println("Enter rate of ordinary trunk call as per hour: ");
		Scanner in = new Scanner(System.in);
		rateofurgent = in.nextInt();
		charges(rateofurgent);
	}
}

public class Call {
	public static void main(String[] args) {
		trunkcall obj;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your type: 1:");
		System.out.println("1) ordinary trunk call");
		System.out.println("2) urgent trunk call");
		int i = in.nextInt();

		switch (i) {
		case 1:
			System.out.println("It was an Ordinary trunk call");
			obj = new ordinarytrunkcall();
			break;
		case 2:
			System.out.println("It was an urgent trunk call");
			obj = new urgenttrunkcall();
			break;
		default:
			System.out.println("It was not a trunk call"); // default case is good for user understanding
		}

	}
}

