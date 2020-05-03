import java.util.Scanner;
public class Staircase
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		Sysytem.out.println("Enter the height of Staircase: ");
		int height = scan.nextInt();   //Input for height of staircase

		int c=height-1;
		for(int i=0; i<height; i++)
		{
			for(int j=0; j<height; j++)
			{
				if(j<c)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print(" #");
				}
			}
			System.out.println();
			c=c-1;
		}





		
