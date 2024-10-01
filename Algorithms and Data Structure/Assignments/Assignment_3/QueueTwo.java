class Stack{
	int size;
	int top;
	int arr[];
	
	Stack(int size){
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	
	boolean isEmpty(){
		return (top<0);
	}
	boolean isFull(){
		return (top>=(size-1));
	}
	
	void push(int n){
		if(!isFull()){
			arr[++top] = n;
		}else{
			System.out.println("Stack is Full!!");
		}
	}
	
	int pop(){
	    if(!isEmpty()){
			return arr[top--];
		}else{
			System.out.println("Stack is Empty!!");
			return -1;
		}	
	}
	
	int peek(){
		if(!isEmpty()){
			return arr[top];
		}else{
			System.out.println("Stack is Empty!!");
			return -1;
		}
	}
	
	int get(int i){
		return arr[i];
	}
}

class Queue{
	int size;
	Stack s1;
	Stack s2;
	
	Queue(int size){
		this.size = size;
		s1 = new Stack(size);
		s2 = new Stack(size);
	}
	
	void enqueue(int element){
		s1.push(element);
	}
	
	int dequeue(){
		if(s2.isEmpty()){
			if(s1.isEmpty()){
				return -1;
			}
		}
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		
		return s2.pop();
	}
	
	void displayQ(){
		if(s1.isEmpty() && s2.isEmpty()){
			return;
		}
		
		for(int i=s2.top; i>=0; --i){
			System.out.print(s2.get(i)+" ");
		}
		
		for(int i=0; i<s1.top; ++i){
			System.out.print(s1.get(i)+" ");
		}
		System.out.println();
	}
		
}

public class QueueTwo{
	public static void main(String[] args){
		Queue q = new Queue(3);
		q.enqueue(3);
		q.enqueue(7);
		q.dequeue();
		
		q.displayQ();
		
		
		
	}
}