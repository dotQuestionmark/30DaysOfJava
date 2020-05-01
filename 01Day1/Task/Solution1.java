public class Arithmetic {
	public static void main(String[] args)
	{
		double mealcost=12.00;
		int tipPercent=20;
		int taxPercent=8;

		double tip=((mealcost*tipPercent)/100);
		double tax=((mealcost*taxPercent)/100);
		int totalcost=tip+tax+mealcost;
		System.out.print(totalcost);
	}
}

