class Queue{
	Node head;
	Node front;
	Node rear;
	static int max=10;
	static int count=0;
	
	static class node{
		int data;
		Node next;
		
		Node(int x){
		this.data=x;
		this.next=null;
		}
		
		void enqueue(int x){
			Node n=new Node(x);
			if(isfull){
				System.out.println("Queue overflow");
			}
			else if (isempty()){
				front=n;
				rear=n;
				count++;
			}
		else{
			rear.next=n;
			rear=n;
			count++;
				
			}
		}
		boolean isfull()
		{
			if (count==max)
				return true;
				return false;
			}
			{
			boolean isempty();
				if (count==0)
					return true;
					return false;
			}
			
			int dequeue(){
				if (isempty()){
					system.out.println("queue is underflow");
				}
				else{
					Node temp=front;
					front = front.next;
					count--;
					reurn temp.data;
				}
			}
			
			Node temp=front
			while(temp.next!=rear){
				System.out.println(temp.data);
				temp=temp
			}
	}
}

