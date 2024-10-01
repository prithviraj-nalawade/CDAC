class CQueue{
	int size;
	int arr[];
    int front, rare; 
	CQueue(int size){
		this.size = size;
		front=rare=-1;
		this.arr = new int[size];
	}
	boolean isEmpty(){
		return front == -1;
	}
	boolean isFull(){
		return (rare+1)%size == front;
	}
	void enqueue(int n){
		if(isFull()){
			return;
		}else{
		if(front == -1){
			front++;
		}
		rare = (rare+1)%size;
		arr[rare] = n;
		
	}
	}
	
	void dequeue(){
		if(isEmpty()){
			return;
		}else{
			if(front>rare){
				front = rare = -1;
			}else{
			front = (front+1)%size;
			}
			
		}
		
	}
	
		
}

public class FixedCQueue{
	public static void main(String[] args){
		CQueue q = new CQueue(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		System.out.print(q.isFull());
	}
}