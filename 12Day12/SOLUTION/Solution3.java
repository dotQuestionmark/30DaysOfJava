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

