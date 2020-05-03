The Java String compareTo() method is used for comparing two strings lexicographically. Each character of both the strings is converted into a Unicode value for comparison. If both the strings are equal then this method returns 0 else it returns positive or negative value.

Example:
public class CompareToExample {
   public static void main(String args[]) {
       String str1 = "String method tutorial";
       String str2 = "compareTo method example";
       String str3 = "String method tutorial";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str1.compareTo( str3 );
       System.out.println("str1 & str3 comparison: "+var2);

       int var3 = str2.compareTo("compareTo method example");
       System.out.println("str2 & string argument comparison: "+var3);
   }
}

//   output for above code :
//   str1 & str2 comparison: -16
//   str1 & str3 comparison: 0
//   str2 & string argument comparison: 0

you cana also use import.java.util.Scanner to input a string and then use the function compareT0() with syntax: string1.compareTo()("Just a string other or another string");

