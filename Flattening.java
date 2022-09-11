
import java. util.*;
import java.util.Collections;
 class Flattening {
    public static void main (String args[]){
        LinkedList<Integer>lst=new LinkedList<>();
        lst.add(30);
        lst.add(8);
        lst.add(7);
        lst.add(5);
        lst.add(20);
        lst.add(10);
        lst.add(50);
        lst.add(22);
        lst.add(19);
        lst.add(45);
        lst.add(40);
        lst.add(35);
        lst.add(28);
        System.out.println(lst);
        lst.remove(5);
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
        lst.addLast(66);
        System.out.println(lst);
        lst.addFirst(95);
        System.out.println(lst);
        lst.peek();
        System.out.println(50);
    }
    
}
