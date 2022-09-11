import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        Scanner sz=new Scanner(System.in);
        int c=sz.nextInt();
        int fact=1;
        for(int i=1;i<=c;i++){
            fact=fact*i;
            System.out.println(fact);
        }
       
    }
    
}
