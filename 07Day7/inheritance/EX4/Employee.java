package DAY7;

import java.util.Scanner;

class worker {
	protected String departmen1 = "devops";
	protected String department2 = "big data";
	public int ID;
	protected int Salary;
	public String name;
	public String department;

	worker() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name ");
		name = in.nextLine();
		System.out.println("Enetr your worker Id");
		ID = in.nextInt();
		System.out.println("Enter your department name");
		department = in.nextLine();
		if (department.isEmpty()) {
			department = in.nextLine().toLowerCase();
		}
	}
}

class salarydecide extends worker {
	void salaryfinal() {
		if (department.matches(departmen1)) {
			Salary = 10000 * 15 / 100 + 10000;
			System.out.println("you salary after increment is" + " " + Salary);
		} else if (department.matches(department2)) {
			Salary = 10000 * 10 / 100 + 10000;
			System.out.println("you salary after increment is" + " " + Salary);
		} else {
			System.out.println("sorry we don't have any department of this name");
		}
	}
}

public class Employee {
	public static void main(String[] args) {
		salarydecide obj = new salarydecide();
		obj.salaryfinal();
	}
}

