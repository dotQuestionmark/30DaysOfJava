// Interface looks like a class but it is not a class. An interface can have methods and variables just like the class but the methods declared in interface are by default abstract.
// Also, the variables declared in an interface are public, static & final by default. We will cover this in detail, later in this guide.
// interface are used for full abstraction.
// Since methods in interfaces do not have body, they have to be implemented by the class before you can access them.
// Also, java programming language does not allow you to extend more than one class, However you can implement more than one interfaces in your class.


interface EX1
{
    // All the methods are public abstract by default
    // As you see they have no body
    
   public void method1();
   public void method2();
}
