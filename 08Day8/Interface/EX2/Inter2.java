package DAY8;

import java.util.Scanner;

interface num1 // defining interface
{
	void method1(); // by default, abstract function

	void method2();
}

class MyClass implements num1 // implementing interface
{
	public void method1() // defining abstract function
	{
		System.out.println("method 1 defines addition function");
		Scanner in = new Scanner(System.in); // making object for scanner
		System.out.println("Enter two numbers num1 and num2 for addition:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum is:" + sum);
	}

	public void method2() // defining abstract function
	{
		System.out.println("method 1 defines subtraction function");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers num1 and num2 for subtraction:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int subtraction = num1 - num2;
		System.out.println("Subtraction is:" + subtraction);
	}
}

public class Inter2 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.method1();
		obj.method2();
	}
}

