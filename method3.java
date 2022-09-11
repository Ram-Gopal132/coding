import java.util.Scanner;

public class method3 {
    public static void calculateFact(int a){
        int factorial=1;
        for (int i=a;i>=1;i--){
            factorial=factorial*i;
        }
    System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int a=st.nextInt();
        calculateFact(a);
    }
}
