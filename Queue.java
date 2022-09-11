import java.util.*;
import java.util.Queue;

 class queue {
    public static void main(String args[]){
        Queue<Integer>Qt=new LinkedList<>();
        Qt.offer(54);    //  Add a value
        Qt.offer(64);
        Qt.offer(84);
        Qt.offer(58);
        Qt.remove(54);
        Qt.isEmpty();
      // two element does not add same queue
      //  Qt.offer(64);  

        //System.out.println(Qt.peek());   //find the peek element
       // System.out.println(Qt.size());   // find the queue size
        System.out.println(Qt);
        System.out.println(Qt);
    }
    
}
