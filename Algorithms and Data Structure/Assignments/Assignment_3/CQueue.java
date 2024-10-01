public class CQueue{
	int size;
	int front, rear;
	int CQ[];
	
	CQueue(int size){
		this.size = size;
		front = rear = -1;
		this.CQ = new int[size];
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return ((rear+1)%size == front);
	}
	
	void enqueue(int n){
		if(isFull()){
			System.out.println("Queue is Full!!");
		}else{
			if(front == -1){
			   front = 0;
			}
			rear = (rear + 1) %size; //imp
			CQ[rear] = n;
			System.out.println(n+" Inserted");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}else{
			int x = CQ[front];
			if(front>rear){
				front = -1;
				rear = -1;
			}
			else{
				front = (front+1)%size;
			}
			return x;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			for(int i=front; i!=rear; i=(i+1)%size){
				System.out.print(CQ[i]+" ");
			}
			System.out.println(CQ[rear]);
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		CQueue q = new CQueue(5);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		
		q.display();
		q.dequeue();
		q.enqueue(8);
		q.display();
		
		
		
	}
	
}