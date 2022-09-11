import java.util.*;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<Integer>();

        // creating

        st.add(25);
        st.add(36);
        st.add(58);
        st.add(252);
      
        System.out.println(st);

        //remove

       st.remove(25);
        System.out.println(st);

        //

        if(st.contains(25));{
            System.out.println("element is found");
        }
        if(!st.contains(36)){
            System.out.println("element is not found");
        }
            
           // find the size
           System.out.println(st.size());
           // iterator
           Iterator it=st.iterator();
           it.next();
           System.out.println(it);
        }
        


    }
    

