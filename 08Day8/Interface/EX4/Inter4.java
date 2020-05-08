package DAY8;

import java.util.Scanner;

interface demooverriding {
	void division(); // abstract methods

	default void modules() // default methods which can be overridden
	{
		System.out.println("in parent interface and in module method");
	}
}

interface extendeddemo extends demooverriding // extending another interface
{
	default void modules() // overriding default method of parent interface
	{
		System.out.println("in  sub-interface and in module method");
	}
}

public class Inter4 implements extendeddemo {
	public void division() {
		System.out.println("in division method");
	}

	public static void main(String[] args) {
		Inter4 obj = new Inter4(); // making object because static to non-static can't be called
		System.out.println("Calling division function\n");
		obj.division();
		System.out.println("Calling module function\n");
		obj.modules();
	}
}

