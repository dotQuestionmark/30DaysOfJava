package DAY9;

class even extends Thread {
	// thread for printing even no
	public void run() {
		for (Integer i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "is even");
			}
		}
	}
}

class odd extends Thread {
	// thread for printing odd number
	public void run() {
		for (Integer i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i + "is odd");
			}
		}
	}
}

class test {
	test() throws InterruptedException {
		even obj1 = new even();
		odd obj2 = new odd();
		obj1.start();
		obj1.join(); // joining to main thread
		obj2.start();
		obj2.join();
	}
}

public class Thread2 {
	public static void main(String[] args) throws InterruptedException {
		test obj = new test();

	}
}

