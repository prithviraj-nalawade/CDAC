package org.student;

public class Student {
   private String name;
   private int rollNo;
   private int marks;
   
   public Student() {
	   this(null, 0, 0);
   }
   
   public Student(String name, int rollNo, int marks) {
	   this.name = name;
	   this.rollNo = rollNo;
	   this.marks = marks;
   }
   
   public void displayRecord() {
	System.out.println("Name  :  "+this.name);
	System.out.println("Roll No.  :  "+this.rollNo);
	System.out.println("Marks  :  "+this.marks);
}
   
}
