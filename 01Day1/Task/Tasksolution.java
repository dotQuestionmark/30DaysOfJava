package DAY1;

import java.util.Scanner; //imported java Scanner class 

public class Tasksolution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// created an object in for taking an input
		double meal_cost = in.nextDouble();// took mealcost in double data type pay attention on data types in this
											// documentation
		int tip_percent = in.nextInt();// took tippercent in int data type
		int tax_percent = in.nextInt();// took tax percent in int data type
		double tax = (double) tax_percent / 100 * meal_cost;// now here is a twist were most of the new students make
															// mistake here if you divide the int value (taxpercent) by
															// 100 and the value of tax percent is less than 100 you
															// will get output 0 so overall in the end value for tax
															// will be zero. to prevent this we have to change it into
															// double and to that you have to add (double before the
															// operation) now again i am giving you time to find more
															// about data type convertion
		// System.out.println(tax);
		double tip = (double) tip_percent / 100 * meal_cost;// did same for tip
		// System.out.println(tip);
		int totaclcost = (int) (meal_cost + tip + tax);// now did same but converted the value of operation to int
														// because total cause is defined as int
		System.out.println("Your total bill is of :" + totaclcost);
	}
}

