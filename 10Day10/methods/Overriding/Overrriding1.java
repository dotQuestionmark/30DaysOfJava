package DAY10;

class test {
	// Overridden method
	public void test() {
		System.out.println("robot is testing");
	}
}

public class Overrriding1 extends test {
	public void test() {
		System.out.println("Boy is testing");// so as this method overrides so this method will work only
	}

	public static void main(String args[]) {
		Overrriding1 obj = new Overrriding1();
		// This will call the child class version of test()
		obj.test();// so now you guys would be thinking that what is the use of overriding hmm nice
					// question but if i answer this to you will eventually forget as i did when my
					// mentor told me the need of overriding so one of your task for to day will be
					// to find what overriding is and how it helps
	}
}

