package DAY7;

import java.util.Scanner;

class labour {
	public String name;
	public int salaryrate;

	labour() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name:");
		name = in.nextLine();
		System.out.println("Enter salaryrate:");
		salaryrate = in.nextInt();
	}

	void compay(int hrs) {
		int salary = hrs * salaryrate;
		System.out.println("Slary is:" + salary);
	}
}

class dailyworker extends labour {
	dailyworker() {
		System.out.println("Daily workers will be paid according to 40 hours a week");
	}
}

class salariedworker extends labour {
	salariedworker() {
		System.out.println("Salaried labour will be paid according to no of days he/she works");
	}
}

public class Dailyyworker {
	public static void main(String[] args) {
		labour w;
		w = new dailyworker();
		w.compay(40);
		w = new salariedworker();
		System.out.println("Enter no of days salaried labour worked: ");
		Scanner in = new Scanner(System.in);
		int days = in.nextInt();
		w.compay(days);
	}
}

