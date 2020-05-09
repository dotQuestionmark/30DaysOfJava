package DAY9;

class Counter1 {
	Integer count = 0;

	public synchronized void increament() {
		count++;
	}
}

public class Thread3 {
	public static void main(String[] args) {
		Counter1 obj = new Counter1();
		// Runnable obj1=new Runnable();
		Thread t1 = new Thread(new Runnable() // implementing runnable for thread 1
		{

			public void run() {

				for (Integer i = 0; i < 1000; i++) {
					obj.increament();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() // implementing runnable for thread 2
		{
			public void run() {
				for (Integer i = 0; i < 1000; i++) {
					obj.increament();
				}
			}
		});
		t1.start();
		t1.setName("Thread1");
		System.out.println(t1.getName());
		t1.run();
		t2.start();
		t1.setName("Thread2");
		System.out.println(t1.getName());
		t2.run();
		System.out.println(obj.count);
	}
}

