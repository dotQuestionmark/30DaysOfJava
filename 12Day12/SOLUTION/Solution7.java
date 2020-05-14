import java.util.*;

class Stack
{
	private int arr[];
	private int top;
	private int capacity;

	// Constructor to initialize stack
	Stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Utility function to add an element x in the stack
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// Utility function to pop top element from the stack
	public int pop()
	{
		// check for stack underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		System.out.println("Removing " + peek());

		// decrease stack size by 1 and (optionally) return the popped element
		return arr[top--];
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		if (!isEmpty())
			return arr[top];
		else
			System.exit(1);

		return -1;
	}

	// Utility function to return the size of the stack
	public int size()
	{
		return top + 1;
	}

	// Utility function to check if the stack is empty or not
	public Boolean isEmpty()
	{
		return top == -1;	// or return size() == 0;
	}

	// Utility function to check if the stack is full or not
	public Boolean isFull()
	{
		return top == capacity - 1;	// or return size() == capacity;
	}
