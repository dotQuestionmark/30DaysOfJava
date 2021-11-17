package Day2.methodFunction;

public class Overloading {
    public static void main(String[]args){
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 5));
    }
//method overloading involves same method "sum" with different parameters
public static int sum(int a, int b){
    return a+b;
}
public static int sum(int a, int b, int c){
    return a + b + c;
}
}

