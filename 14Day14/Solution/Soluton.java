import java.util.*;
public class String{
	public static void main(String[] args) {
Scanner input =  new Scanner(System.in);
String name = "";

System.out.println("Please enter your name: ");
name = input.nextLine();

name= name.toLowerCase();

try{
    if(!name.find()){ // If string contains any number/symbols etc...
        throw new Exception("Not a perfect String");
    }
