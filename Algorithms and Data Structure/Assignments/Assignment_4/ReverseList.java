class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class ReverseList{
	Node head;
	
	void append(int data){
		Node new_node = new Node(data);
	
		if(head == null){
			head = new_node;
		}else{
			new_node.next = null;
			Node temp = head;
			
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new_node;
		}
			
	}
	
	Node reverse(Node n){
		Node prev = null;
		Node next = null;
		Node current = n;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
			
		}
        n=prev;
		
		return n;
	}
	
	void display(){
		Node temp = head;
		while(temp!=null){
			    System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.println();
			
	}
	
	public static void main(String[] args){
		ReverseList r = new ReverseList();
		r.append(5);
		r.append(6);
		r.append(7);
		r.display();
		r.head = r.reverse(r.head);
		r.display();
		
		
	}
}