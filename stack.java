
import java.util.Stack;
    class stack{
        public static void main(String args[]){
            Stack<Integer>it=new Stack<>();
            it.push(13);
            it.push(12);
            it.push(45);
            it.push(54);
            it.push(45);
            it.pop();
            it.push(78);
            it.empty();
            System.out.println(it);
            
        }
    }
