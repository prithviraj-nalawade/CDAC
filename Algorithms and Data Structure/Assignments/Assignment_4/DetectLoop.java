class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}



public class DetectLoop{
	Node head;
	Node append(int data){
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
		return new_node;
	}
	
	boolean loop(){
		Node slow = head, fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow)
				return true;
		}
		return false;
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
		DetectLoop d = new DetectLoop();
		d.append(1);
		d.append(2);
		d.append(3);
		d.append(4);
		Node last_node = d.append(5);
		d.append(1);
		last_node.next = d.head;
		
		
		System.out.println(d.loop());
	}
}