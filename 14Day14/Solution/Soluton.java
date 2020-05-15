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


        //This will not be executed if exception occurs
    System.out.println("This will not be executed if exception occurs");

}catch(Exception e){
    System.out.println(e.toString());
}
System.out.println("Exception handling");
	}

