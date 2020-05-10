package DAY10;

class DisplayOverloading {
	public void disp(char c) {// here you can see that i have made two methods with same name but with
								// different parameters
		System.out.println(c);
	}

	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}

public class Overloading1 {
	public static void main(String args[]) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');// and when i called them they work fine thats what method overloading is all
						// about
		obj.disp('a', 10);
	}
}

