package DAY8;

import java.util.Scanner;

interface demo {
	Scanner in = new Scanner(System.in); // making object of scanner class
	int number = in.nextInt();

	void functions(); // abstract functions
}

class myclass1 implements demo // implementing interface demo
{
	public void functions() // defining abstract function
	{
		// number++; will show error
		int square = number * number;
		System.out.println("Square is: " + square);
	}
}

public class Inter3 implements demo {
	public void functions() // defining functions
	{
		System.out.println("Enter number upto which we want to compare:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		// number++; will show error
		System.out.println("Sum is" + number + num);
	}

	public static void main(String[] args) {
		myclass1 obj = new myclass1();
		obj.functions();
		Inter3 obj1 = new Inter3();
		obj1.functions();
		// functions();
	}
}

