package DAY11;

public class Exep8 {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		Exep8 f1 = new Exep8();
		Exep8 f2 = new Exep8();
		f1 = null;
		f2 = null;
		f1.finalize();
		f2.finalize();
		System.gc();
	}
}

