 
 import java.util.Scanner;
 class Reverse {

    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);

      String s1 = str.nextLine();
      String s2 = reverse(s1);
      System.out.println("reversed your sentence= " +s2);
    }
  
    public static String reverse(String s1) {
      if (s1.isEmpty())
        return s1;
  
      return reverse(s1.substring(1)) + s1.charAt(0);
    }
  }