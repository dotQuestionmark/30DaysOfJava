package DAY7;

import java.util.Scanner;

class player {// here i created player class which has name fees and add variables defined in
				// it
	private String name;// i did not want to use this in any furthre class so i made it as private
	private int fees;// same with fees
	protected int add = 0;// i want this to be accesable for different inherited classes so i made it
							// protected

	player() {// now i created a player counstructor which take input from you

		Scanner in = new Scanner(System.in);
		System.out.println("Enter fees deposited");
		int fees = in.nextInt();
		if (fees == 1000) {
			System.out.println("Enter Player name");
			Scanner in1 = new Scanner(System.in);
			name = in1.nextLine();
			add = 1;// variable to check that you deposited the desired amount of fees or not and
					// use this as that reference
		} else {
			add = 2;
		}
	}

}

class hockeyplayer extends player {// inherits class player same with all the classes below
	void needofmaterial() {
		if (add == 1) {
			System.out.println("Congratulation you got addmission in our accademy");
			System.out.println("Bring your own Hockey stick for practice from tommorow");
		} else {
			System.out.println("Sorry you did not submited the sufficient ammount");
		}

	}
}

class cricketplayer extends player {
	void needofmaterial() {
		if (add == 1) {
			System.out.println("Congratulation you got addmission in our accademy");
			System.out.println("Bring your own L-guard for practice from tommorow");
		} else {
			System.out.println("Sorry you did not submited the sufficient ammount");
		}
	}
}

class footballplayer extends player {
	void needofmaterial() {
		if (add == 1) {
			System.out.println("Congratulation you got addmission in our accademy");
			System.out.println("Bring your own pair of football boots for practice from tommorow");
		} else {
			System.out.println("Sorry you did not submited the sufficient ammount");
		}
	}
}

public class Game {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the sport you play");
		System.out.println("1) Hockey(Rs 1000 per month to be deposited in advance)");
		System.out.println("2) Cricket(Rs 1000 per month to be deposited in advance)");
		System.out.println("3) Football(Rs 1000 per month to be deposited in advance)");// according to switch case
																						// calls different classes
		int sport = in.nextInt();
		switch (sport) {
		case 1: {
			hockeyplayer obj = new hockeyplayer();
			obj.needofmaterial();
			break;
		}
		case 2: {
			cricketplayer obj = new cricketplayer();
			obj.needofmaterial();
			break;
		}
		case 3: {
			footballplayer obj = new footballplayer();
			obj.needofmaterial();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + sport);
		}
	}
}

