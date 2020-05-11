package DAY11;

public class Exep5 {
	public static void main(String[] args) {

		try {
			try {
				System.out.println("going to divide");
				int b = 100 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);// here cannot be divided by zero exception wil run
			}

			try {
				int a[] = new int[5];
				a[5] = 4;// here array out of bounds exception will run
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("This is how a try catch block flows");
	}
}

