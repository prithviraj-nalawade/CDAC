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



public class EvalPostFix{
	static int eval(String n){
		Stack s = new Stack(10);
		String[] strArr = n.split(" ");
		for(String str : strArr){
			if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
				int op2 = s.pop();
				int op1 = s.pop();
				
				int r = operation(str, op1, op2);
				s.push(r);
			}else{
				s.push(Integer.parseInt(str));
			}
		}
		return s.pop();
	}
	
	static int operation(String opr, int op1, int op2){
		switch(opr){
			case "+": return op1+op2;
					  
			case "-": return op1-op2;
					  
		    case "*": return op1*op2;
					  
			case "/": return op1/op2;
			default:
                throw new IllegalArgumentException("Invalid operator: " + opr);		 
			
	}
	
}
public static void main(String[] args){
		String str = "5 3 + 2 *";
		System.out.println(eval(str));
	}
}