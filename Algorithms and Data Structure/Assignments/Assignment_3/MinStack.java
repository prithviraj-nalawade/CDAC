class Stack{
	int size;
	int top;
	int arr[];
    int min = Integer.MAX_VALUE;
	
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
			if(min>n){
				min = n;
			}
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
	
	int getMin(){
		return min;
	}
	
	void display(){
		if(!isEmpty()){
			for(int i=0; i<=top; ++i){
				System.out.println(arr[i]);
		}
		}else{
			System.out.println("Stack is Empty!!");
			
		}
	}
}
public class MinStack{
	public static void main(String[] args){
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(-4);
		s.push(6);
		s.push(-1);
		System.out.println("Min: "+s.getMin());
	}
}