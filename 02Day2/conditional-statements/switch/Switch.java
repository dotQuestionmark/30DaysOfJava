package DAY2;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tell us what you are");
		System.out.println("1) kid");
		System.out.println("2) Teen");
		System.out.println("3) Adult");
		System.out.println("4) senior citizen");
		int number = in.nextInt();
		switch (number) {// switch is widely used for menu driven programs so here we gave user an opti
							// to chose and enter the number out of four
		case 1: {// if he entered 1 this case will run
			System.out.println("you are a kid");
			break;// here break is used because if we dont use break and case one runs so after
					// that all the case will run so to stop the program after running the desired
					// case we use break to exit the switch condition
		}
		case 2: {// if he entered 2 this case will run
			System.out.println("you are a Teen");
			break;
		}
		case 3: {// if he entered 3 this case will run
			System.out.println("you are a Adult");
			break;
		}
		case 4: {// if he entered 4 this case will run
			System.out.println("you are a senior citezen");
			break;
		}
		default:// if enters any number expect 1,2,3,4 this case will run
			throw new IllegalArgumentException("Unexpected value: " + number);// exception of an illegal argument
		}
	}
}

