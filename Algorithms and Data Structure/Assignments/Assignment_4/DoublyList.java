class Node{
	int data;
	Node next, prev;
	Node(int data){
		this.data = data;
		next=prev=null;
	}
}

public class DoublyList{
	Node head;
	void append(int data){
		Node new_node = new Node(data);
		if(head == null){
			new_node.prev = null;
			head = new_node;
			return;
		}
			new_node.next = null;
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = new_node;
			new_node.prev = temp;
		
	}
	
	void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args){
		DoublyList d = new DoublyList();
		d.append(10);
		d.append(11);
		d.append(12);
		d.append(13);
		d.display();
		
	}
	
} 