// class implements interface where an interface extends another interface

interface inter{
   public void method1();
}
interface Interface extends inter {
   public void method2();
}
public class EX3 implements Interface{
    // Even though this class is only implementing the
    // interface (Interface), it has to implement all the methods
    // of inter as well because the interface (Interface) extends inter
    
    public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }
    public static void main(String args[]){
	Interface obj = new EX3();
	obj.method2();
    }
}
