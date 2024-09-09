package org.assignment4;

import java.util.Scanner;

public class Employee {
      String name;
      int id;
      String city;
      float sal;
      
      void setFields(String name, int id, String city, float sal) {
    	 
    	  
    	  this.name = name;
    	  this.id = id;
    	  this.city = city;
    	  this.sal = sal;
    }
      
      void getFields() {
    	  
    	  System.out.print("Name 	:	"+this.name+"\n");
    	  System.out.print("Id 	:	"+this.id+"\n");
    	  System.out.print("City 	:	"+this.city+"\n");
    	  System.out.print("Salary 	:	"+this.sal+"\n");
      }
      
      
     public static void main(String[] args) {
		Employee emp = new Employee();
		 String name;
	      int id;
	      String city;
	      float sal;
	      System.out.println(args[0]);
	  Scanner sc = new Scanner(System.in);
   	  System.out.print("Enter Name 	:	");
   	  name = sc.nextLine();
   	  System.out.print("Enter id 	:	");
   	  id = sc.nextInt();
   	  System.out.print("Enter city 	:	");
   	  city = sc.next();
   	  System.out.print("Enter salary 	:	");
   	  sal = sc.nextFloat();
		
		emp.setFields(name, id, city, sal);
	    
		emp.getFields();
		
		sc.close();
	}
}
