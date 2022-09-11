import java.util.ArrayList;   //or ArrayList
import java.util.Collections;
    class ArrayLis{
        public static void main(String args []){
      ArrayList<Integer>list=new ArrayList<>();

            //add element

      list.add(15);
      list.add(35);
      list.add(65);
      list.add(45);
      list.add(85);
      list.add(95);
            
      System.out.println(list);

            //get element
            //pass the index value

            System.out.println(list.get(1));

            //add element in between
            list.add(2,25);
            System.out.println(list);

            //set element
            list.set(1,655);
            System.out.println(list);

            //delete element
            list.remove(4);
            System.out.println(list);

            // find the size any arraylist
            System.out.println(list.size());

            // loop find get function
            for(int i=1;i<list.size();i++){
                System.out.print(list.get(i));

            }
            System.out.println();

            // sorting this is sort the element ascending order

            Collections.sort(list);
            System.out.println(list);
        }
    }