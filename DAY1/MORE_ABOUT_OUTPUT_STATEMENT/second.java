

package DAY1;

public class second {
	public static void main(String[] args) {
		System.out.println("HELLO");// first statement
		// here after reading and seeing the first.java file you must have realized by
		// know that after printing HELLO java will change and start printing from next
		// line
		// first it will print -> HELLO
		System.out.print("***");// second statement
		// now if you see second statement do not have ln after print so her it will not
		// change line and start printing the third statement after the second statement
		// second it will be-> HELLO
		//                     ***
		System.out.println("WORLD");// third statement
		// and now the third statement will execute and start printing the statement
		// from the same line from where it left the second statement
		// third will be->HELLO
		//                ***WORLD
		// now it will change line to print the fourth statement but its not there 
		// so the program will terminate and this is how the output will be printed
	}
}

