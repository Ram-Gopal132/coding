import java.util.Scanner;

public class Add {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c=m+n;
        int d=m-n;
        {
            System.out.println("sum of two number: " +c);
            System.out.println("sub of two number: " +d);
            System.out.print("multiply of two number:  " +m*n);
        }

    }

}
