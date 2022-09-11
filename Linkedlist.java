//  collection in java
import java.util.LinkedList;        //or *

public class Linkedlist {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(12);
        ll.addFirst(128);
        ll.add(87);
        ll.addFirst(122); 
        ll.addLast(85);
        System.out.println(ll);
        System.out.println(ll.size());  // calculate the size
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));  //return the index element
        }
      
        System.out.println("null");
       // ll.removeFirst();   // remove the value first

            ll.remove(2);  //  value remove for index
            
            System.out.println(ll);
    }
}