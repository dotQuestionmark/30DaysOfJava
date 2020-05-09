package DAY9;

class Hi extends Thread {
	public void run() {
		for (Integer i = 0; i < 3; i++) {
			System.out.println("Hi");
		}
	}
}

class hello extends Thread {
	public void run() {
		for (Integer i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
	}
}

class threadingdemo {
	threadingdemo() {
		Hi obj1 = new Hi();
		hello obj2 = new hello();
		obj1.start();

		obj2.start();
	}
}

//Implementing runnable interface
class multi implements Runnable {
	public void run() {
		System.out.println("Threading is done i am runnable interface");
	}
}

class threadingusingrunnableinterface {
	threadingusingrunnableinterface() {
		multi m = new multi();
		Thread t1 = new Thread(m);
		t1.start();
	}
}

public class Thread1 {
	public static void main(String[] args) {
		threadingdemo obj = new threadingdemo();
		threadingusingrunnableinterface obj1 = new threadingusingrunnableinterface();

	}

}

