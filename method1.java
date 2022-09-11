
import java.util.*;
public class method1 {
    public static void myName(String name){
        System.out.println("your name is:    "  +name);
    }
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String name=str.nextLine();
        myName(name);

    }
    
}
