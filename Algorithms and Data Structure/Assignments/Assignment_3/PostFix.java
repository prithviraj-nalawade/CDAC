class Stack<T>{
	int size;
	int top;
	Object arr[];
	
	Stack(int size){
		this.size = size;
		this.top = -1;
		this.arr = new Object[size];
	}
	
	boolean isEmpty(){
		return (top<0);
	}
	boolean isFull(){
		return (top>=(size-1));
	}
	
	void push(T n){
		if(!isFull()){
			arr[++top] = n;
		}else{
			System.out.println("Stack is Full!!");
		}
	}
	    @SuppressWarnings("unchecked")
	T pop(){
	    if(!isEmpty()){
			return (T)arr[top--];
		}else{
			System.out.println("Stack is Empty!!");
			return null;
		}	
	}
	    @SuppressWarnings("unchecked")
	T peek(){
		if(!isEmpty()){
			return (T)arr[top];
		}else{
			System.out.println("Stack is Empty!!");
			return null;
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



public class PostFix{
	private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
	public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>(10);
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            
            if (c == ' ') continue;

            
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c).append(" ");
            }
         
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }
        }

       
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }
	

        String infix1 = "A + B * C";
        System.out.println(infixToPostfix(infix1));

	}
}