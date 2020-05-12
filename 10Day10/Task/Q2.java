import java.util.regex.*;  
public class RegexExample1{  
public static void main(String args[]){ 
	//1st way
Pattern p = Pattern.compile(".s");//. represents single character
Matcher m = p.matcher("as");
boolean b = m.matches();

//2nd way
boolean b2=Pattern.compile(".s").matcher("as").matches();
