class Stack{
	int size;
	int top;
	char arr[];
	
	Stack(int size){
		this.size = size;
		this.top = -1;
		this.arr = new char[size];
	}
	
	boolean isEmpty(){
		return (top<0);
	}
	boolean isFull(){
		return (top>=(size-1));
	}
	
	void push(char n){
		if(!isFull()){
			arr[++top] = n;
		}else{
			System.out.println("Stack is Full!!");
		}
	}
	
	char pop(){
	    if(!isEmpty()){
			return arr[top--];
		}else{
			System.out.println("Stack is Empty!!");
			return 'o';
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
}




public class Reverse{
	public static void main(String[] args){
		String str = "hello";
		Stack s = new Stack(str.length());
		for(int i=0; i<str.length(); ++i){
			 s.push(str.charAt(i));
		}
		
		s.display();
		
		String rev = "";
		
		for(int i=0; i<str.length(); ++i){
			 rev += s.pop();
		}
		
		System.out.println(rev);
		
		
	}
	
}