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

public class Brackets{
	static Stack s1 = new Stack(10);
	static boolean match(char open, char close){
		return (open == '(' && close==')')||
		       (open == '{' && close=='}')||
			   (open == '[' && close==']');
	}
	public static String Balancing(String str){
		for(int i=0; i<str.length(); ++i){
			char c = str.charAt(i);
			
			if(c=='(' || c=='{' || c=='['){
				s1.push(c);
			}
			else if(c==')' || c=='}' || c==']'){
				if(s1.isEmpty() || !match(s1.pop(), c)){
					return "Not Balanced";
				}
			}
		}
			return s1.isEmpty() ? "Balanced" : "UnBalanced";
		}
		
	
	
	public static void main(String args[]){
		String n1 = "({[})";
		
		System.out.println(Balancing(n1));
		
	}
	
}