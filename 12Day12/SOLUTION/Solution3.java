import java.util.*;
import java.lang.*;
import java.io,*;

class B
{
	public void print_one()
	{
		System.out.println("Class B");
	}
}

class C
{
	public void print_two()
	{
		System.out.println("Class C");
	}
}
class A extends B,C
{
	public void print_three()
	{
		System.out.println("Class A");
	}
}
class D extends B,c
{
	public void print_four()
	{
		System.ot.println("Class D");
	}
}
public class main
{
	public static void main(String[] args)
	{
		A a= new A();
		a.print_three();
		D d= new D();
		d.print_four();
	}
}


