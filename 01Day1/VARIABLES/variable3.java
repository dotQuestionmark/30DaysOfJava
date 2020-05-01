package DAY1;

public class variable3 {
	public static void main(String[] args) {
		// in previous tutorial file we saw that we used int while doing division
		// but what if the things are not completely divisible
		// lets see
		int num1 = 23, num2 = 12;
		double num3 = 23, num4 = 12;
		// now instead for first applying and operation then printing the value we will
		// directly print the values and lets see the difference between int and double
		System.out.println(num1 / num2);// first statement
		// now if you see that num1 and num2 are int data types so there result will
		// also be int so the and they both are not fully divisible the answer should be
		// 1.something
		// but this first statement will give us only 1 the roundoff value
		// output of first statement-> 1
		System.out.println(num3 / num4);// second statement
		// now if you see here the second statement gives you the out put in double a
		// perfect decimal digit
		// output of second statement -> 1.9166666666666667
	}
}

