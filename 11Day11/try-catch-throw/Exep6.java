package DAY11;

public class Exep6 {
	public static void main(String[] args) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");// this shows what if you always want a piece of code
																	// to run then for that we have finally block which
																	// always run
		}
	}
}

