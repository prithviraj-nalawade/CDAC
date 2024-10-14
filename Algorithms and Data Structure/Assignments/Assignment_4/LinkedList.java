 class Node{
	 int data;
	 Node next;
	 
	 Node(int data){
		 this.data = data;
		 this.next = null;
	 }
 }
 
 
 
 
 public class LinkedList {
   Node head;

   void insert(int var1) {
      Node var2 = new Node(var1);
      var2.next = this.head;
      this.head = var2;
   }

   void append(int var1) {
      Node var2 = new Node(var1);
      if (this.head == null) {
         this.head = var2;
      } else {
         var2.next = null;

         Node var3;
         for(var3 = this.head; var3.next != null; var3 = var3.next) {
         }

         var3.next = var2;
      }
   }

   void delete(int var1) {
      Node var2 = this.head;
      Node var3 = null;
      if (var2 != null && var2.data == var1) {
         this.head = var2.next;
      } else {
         while(var2 != null && var2.data != var1) {
            var3 = var2;
            var2 = var2.next;
         }

         if (var2 != null) {
            var3.next = var2.next;
         }
      }
   }

   void search(int var1) {
      Node var2 = this.head;
      if (var2 == null || var2.data != var1) {
         while(var2 != null && var2.data != var1) {
            System.out.print("\nFound");
            var2 = var2.next;
         }

         if (var2 != null) {
            return;
         }
      }
   }

   void display() {
      for(Node var1 = this.head; var1 != null; var1 = var1.next) {
         System.out.print(var1.data + "-->");
      }

   }

   public static void main(String[] var0) {
      LinkedList var1 = new LinkedList();
      var1.append(3);
      var1.append(5);
      var1.append(7);
      var1.delete(7);
      var1.display();
      var1.search(5);
   }
}