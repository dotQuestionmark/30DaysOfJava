class Rectangle{         //OVERLOADING CLASS

  public static void printArea(int x,int y){
	  System.out.println(x*y);
	   }
  public static void printArea(int x){       //overloading function 1
    System.out.println(x*x);
  }
  public static void printArea(int x,double y){  //overloading function 2
    System.out.println(x*y);
  }
  public static void printArea(double x){   //overloading function 3
    System.out.println(x*x);
    }

  public static void main(String[] args){   //main fucntion for implementation
    printArea(2,4);
    printArea(2,5.1);
    printArea(10);
    printArea(2.3);
}
}

class Animals{        //CLASS FOR OVERRIDING
  public void sound(){
    System.out.println("This is parent class.");
  }
}
class Dogs extends Animals{    //inherited class 1
  public void sound(){
    System.out.println("Dogs bark");
  }
}
class Cats extends Animals{    //inherited class 2
  public void sound(){
    System.out.println("Cats meow");
  }
}
class Monkeys extends Animals{    //inherited class 3
  public void sound(){
    System.out.println("Monkeys whoop.");
  }
}
class m{       //driver class with main functin
public static void main(String[] args){
  Animals d = new Dogs();
  Animals c = new Cats();
  Animals m = new Monkeys();
  d.sound();
  c.sound();
  m.sound();
}
}
