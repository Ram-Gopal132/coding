public class swaps {
    public static void main(String[] args) {
        int n1=12;
        int n2=13;
        System.out.println("before swaping the value of" +n1+ " 
         "+n2);
        n1=n1-n2;
        n2=n1+n2;
        n1=n2-n1;
        System.out.println("after swapping value of " +n1+ "  "+n2);
    }
    
}
