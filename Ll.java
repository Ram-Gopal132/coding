import java.util.*;
class LL {
    Node head;
    Node newNode;
    Node currNode;
    int size;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;

        }
    }


    //add -last,first


    public void addFirst(String data){
        
            Node newNode=new Node(data);
            if( head==null ){
                head=newNode;
                return;
        }
        newNode.next=head;
            head=newNode;
    }
    public void addLast(String data){
        
            Node newNode=new Node(data);
            if( head==null ){
                head=newNode;
                return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next = newNode;
    }


    //print
    //null java
    //NULL c++


    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
             System.out.print(currNode.data + "->" );
        }
    
            currNode=currNode.next;
            System.out.println("NULL");
    }
        //delete first
        public void deleteFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            head=head.next;
        }


// delete last
        public void deleteLast(){
            if(head==null){
                System.out.println("list is empty");
                return;

            }

            if(head.next==null){
                head=null;
                return;
            }
            Node SecondLast=head;
            Node lastNode=head.next;
            while(lastNode !=null){
                lastNode = lastNode.next;
                SecondLast = SecondLast.next;

            }
            SecondLast.next = null;
        }
      public int getSize(){
        return Size;
      }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("a");
       // list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

      System.out.println(list.getSize());

    }
    
}
