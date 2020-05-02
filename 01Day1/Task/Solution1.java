import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(Systen.in);  
		double mealcost=scan.nextDouble();  //orignal mealcost
		int tipPercent=scan.nexInt();       //tip percent
		int taxPercent=scan.nextInt();      //tax percent 

		//Calculations for bill amount 
		double tip=((mealcost*tipPercent)/100);
		double tax=((mealcost*taxPercent)/100);
		int totalcost=(int) (tip+tax+mealcost) ;
		System.out.println("Your total bill is of:"+totalcost);
	}
}

