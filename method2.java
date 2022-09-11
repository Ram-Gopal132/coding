import java.util.Scanner;

public class method2 {
    public static void power(double a ,double b){
        System.out.println("power of the number:  "+a,b);

         Math.pow(a,b);

    }
    public static void main(String[] args) {
       Scanner str=new Scanner(System.in);
      double a=str.nextDouble();
      double b=str.nextDouble();
      power(a,b);  // call the main method
     
    }
    
}
