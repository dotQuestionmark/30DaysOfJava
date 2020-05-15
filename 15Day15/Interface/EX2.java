interface inter
{
   // compiler will treat them as: 
   // public abstract void method1();
   // public abstract void method2();
    
   public void method1();
   public void method2();
}
class EX2 implements inter
{
   // This class must have to implement both the abstract methods
   // else you will get compilation error
    
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	inter obj = new EX2();
	obj.method1();
   }
}
