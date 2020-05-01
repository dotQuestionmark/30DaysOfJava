package DAY1;

public class variable2 {
	public static void main(String[] args) {
		int a = 21, b = 21, c = 3, j = 89;
		// this is how you can declare multiple variables of same type
		String firstname = "harshil", lastname = "bhardwaj";
		// same goes with every datatype
		// now we will be performing some operations on them +,*,/and-
		// and with the String we will concatinate String and the out put
		int sum = a + b;
		// we declared the sum and applied + operations on a and b to give sum its value
		int mul = c * j;
		// we declared the sum and applied * operations on c and j to give sum its value
		int minus = j - a;
		// we declared the sum and applied - operations on a and j to give sum its value
		int div = b / c;
		// we declared the sum and applied / operations on b and c to give sum its value
		System.out.println("SUM IS: " + sum);
		System.out.println("PRODUCT IS: " + mul);
		System.out.println("DIFFERENCE IS: " + minus);
		System.out.println("QUESTIENT IS: " + div);
		System.out.println(firstname + " " + lastname);
		// here we concatenated the out put with + sign so that we can manipulate our
		// out put statement
		// our out put will be
		// SUM IS: 42
		// PRODUCT IS: 267
		// DIFFERENCE IS: 68
		// QUESTIENT IS: 7
		// harshil bhardwaj
		// so this is how we concatenate out put statements
	}
}

