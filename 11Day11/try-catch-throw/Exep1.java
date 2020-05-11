package DAY11;

public class Exep1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int data;
		try {
			data = a / b; // may throw exception
		}
		// handling the exception
		catch (Exception e) {
			// resolving the exception in catch block
			System.out.println(a / (b + 2));
		}
	}
}

