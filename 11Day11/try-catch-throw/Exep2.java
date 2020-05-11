package DAY11;

public class Exep2 {
	public static void main(String[] args) {
		try {
			int array[] = { 1, 3, 5, 7 };
			System.out.println(array[10]); // may throw exception
		}
		// handling the array exception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("The index size shold be 4");
	}
}

