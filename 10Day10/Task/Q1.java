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
