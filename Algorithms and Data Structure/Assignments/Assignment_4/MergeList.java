class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}


public class MergeList{
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
	
	static Node merge(Node l1, Node l2){
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		if(l1.data<l2.data){
			l1.next = merge(l1.next, l2);
			return l1;
		}else{
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}
	
	void display(Node n){
		
		while(n!=null){
			System.out.print(n.data+"-->");
			n = n.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args){
		MergeList l1 = new MergeList();
		l1.append(12);
		l1.append(13);
		l1.append(14);
		l1.append(15);
		
		l1.display(l1.head);
		
		MergeList l2 = new MergeList();
		l2.append(1);
		l2.append(3);
		l2.append(4);
		l2.append(5);
		
		l2.display(l2.head);
		MergeList l3 = new MergeList();
		l3.head = merge(l1.head, l2.head);
		l3.display(l2.head);
		
		
		
	}
}