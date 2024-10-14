class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next =null;
	}
}

public class NthNode{
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
	
	void insertAfter(int data, int key){
		Node new_node = new Node(data);
		Node temp = head;
		if(temp == null){
			temp = new_node;
		}else{
			Node n = null;
			new_node.next = null;
			while(temp!=null){
				n = temp.next;
				if(temp.data == key){
					
					break;
				}
				
				temp = temp.next;
			}
			new_node.next = n;
			temp.next = new_node; 
		}
		
	}
	
	void findNode(int key){
		Node slow = head, fast=head;
		
		for(int i=0; i<key; ++i){
		
		fast = fast.next;
		}		
		while(fast!=null){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+"-->");
			n = n.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		NthNode n = new NthNode();
		n.append(12);
		n.append(14);
		n.append(13);
		n.append(11);  		//12
		n.insertAfter(15, 14);
		
		Node r = n.findNode(2);
		
		n.display();
		System.out.println(r.data);
	}
}