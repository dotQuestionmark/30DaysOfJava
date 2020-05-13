//MWTHOD ONE FOR OVERRIDING

class MyBaseClass{
   protected void disp()
   {
       System.out.println("Parent class method");
   }
}
class MyChildClass extends MyBaseClass{
   public void disp(){
      System.out.println("Child class method");
   }
   public static void main( String args[]) {
      MyChildClass obj = new MyChildClass();
      obj.disp();
   }
}

//METHOD TWO FOR OVERRIDING

class ABC{
   public void myMethod()
   {
	System.out.println("Overridden method");
   }
}
class Demo extends ABC{
   public void myMethod(){
	//This will call the myMethod() of parent class
	super.myMethod();
	System.out.println("Overriding method");
   }
   public static void main( String args[]) {
	Demo obj = new Demo();
	obj.myMethod();
   }
}class ABC{
   public void myMethod()
   {
	System.out.println("Overridden method");
   }
}

