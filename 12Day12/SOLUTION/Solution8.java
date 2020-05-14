i/*
 * Java Program to Implement Queue
 */
 
import java.util.*;
 
/*  Class arrayQueue  */
class arrayQueue
{
    protected int Queue[] ;
    protected int front, rear, size, len;
 /* Constructor */
    public arrayQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    /*  Function to check if queue is full */
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    /*  Function to get the size of the queue */
     public int getSize()
    {
        return len ;
    }
    /*  Function to check the front element of the queue */
    public int peek()
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }
