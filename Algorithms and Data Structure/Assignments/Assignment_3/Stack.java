public class Stack{
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
	
	void display(){
		if(!isEmpty()){
			for(int i=0; i<=top; ++i){
				System.out.println(arr[i]);
		}
		}else{
			System.out.println("Stack is Empty!!");
			
		}
	}
	public static void main(String[] args){
		Stack s = new Stack(10);
		s.push(5);
		s.push(3);
		s.push(7);
		int x = s.pop();
		
		s.display();
		System.out.println("Poped element="+x);
	}
}