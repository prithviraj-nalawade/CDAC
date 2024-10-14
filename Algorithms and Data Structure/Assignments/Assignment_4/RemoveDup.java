class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next =null;
	}
}
public class RemoveDup{
	Node head;
	void append(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}else{
			new_node.next = null;
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
				
			}
			temp.next = new_node;
		}
		
	}
	
	void delete(int key){
		Node temp = head;
		if(temp == null){
			return;
		}
			Node prev = null;
			while(temp!=null && temp.data !=key){
				prev = temp;
				
				temp = temp.next;
			}
			prev.next = temp.next;
		
		
	}
	
	void removeDup(){
		Node temp = head;
		while(temp!=null && temp.next != null){
		if(temp.data == temp.next.data){
			temp.next = temp.next.next;
		}else{
				
			
			temp = temp.next;
		}
		}
		
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data);
			if(n.next != null ){
					System.out.print("-->");
			}
			n = n.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		RemoveDup n = new RemoveDup();
		n.append(11);
		n.append(12);
		n.append(13);
		n.append(14);  		
		n.append(14);  
		n.append(14);
		n.removeDup();
		n.display();
	}
}