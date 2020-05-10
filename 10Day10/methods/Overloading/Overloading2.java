package DAY10;

class DisplayOverloading3 {
	public void disp(char c, int num) {// they have same name and same parameters
		System.out.println("I’m the first definition of method disp");
	}

	public void disp(int num, char c) {
		System.out.println("I’m the second definition of method disp");
	}
}

public class Overloading2 {
	public static void main(String args[]) {
		DisplayOverloading3 obj = new DisplayOverloading3();
		obj.disp('x', 51);// and when i call them both of them run and thats also method-overloading so
							// don't Confuse that you can't create a method that have a same name and same
							// parameters
		obj.disp(52, 'y');
	}
}

