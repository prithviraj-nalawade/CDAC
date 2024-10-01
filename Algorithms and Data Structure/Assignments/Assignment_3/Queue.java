public class Queue{
	int size;
	int front, rear;
	int Q[];
	
	Queue(int size){
		this.size = size;
		front = rear = -1;
		this.Q = new int[size];
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	boolean isFull(){
		return (rear == size-1);
	}
	
	void enqueue(int n){
		if(isFull()){
			System.out.println("Queue is Full!!");
		}else{
			if(front == -1){
			   front = 0;
			}
			rear++;
			Q[rear] = n;
			System.out.println(n+" Inserted");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}else{
			int x = Q[front];
			if(front>rear){
				front = -1;
				rear = -1;
			}
			else{
				front++;
			}
			return x;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			for(int i=front; i<=rear; ++i){
				System.out.print(Q[i]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Queue q = new Queue(5);
		q.enqueue(5);
		q.enqueue(10);
		q.display();
		q.dequeue();
		q.display();
		
		
		
	}
	
}