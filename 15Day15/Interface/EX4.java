// A class cannot implement two interfaces that have methods with same name but different return type.
interface A
{
   public void aaa();
}
interface B
{
   public int aaa();
}

class EX4 implements A,B
{

   public void aaa() // error
   {
   }
   public int aaa() // error
   {
   }
   public static void main(String args[])
   {

   }
}
