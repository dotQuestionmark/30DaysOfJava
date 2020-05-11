class Rectangle{

  public static void printArea(int x,int y){
	  System.out.println(x*y);
	   }
  public static void printArea(int x){
    System.out.println(x*x);
  }
  public static void printArea(int x,double y){
    System.out.println(x*y);
  }
  public static void printArea(double x){
    System.out.println(x*x);
    }

  public static void main(String[] args){
    printArea(2,4);
    printArea(2,5.1);
    printArea(10);
    printArea(2.3);
}
}
