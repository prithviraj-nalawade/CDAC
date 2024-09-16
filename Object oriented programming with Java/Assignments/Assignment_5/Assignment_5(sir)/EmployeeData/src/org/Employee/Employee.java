package org.Employee;

public class Employee {
     private static int totalEmployee;
     private static double totalExpense;
     
     private String name;
     private int id;
     private double salary;
     
     public Employee(String name, int id, double salary) {
    	 this.name = name;
    	 this.id = id;
    	 this.salary = salary;
    	 Employee.totalEmployee++;
    	 Employee.totalExpense += salary;
     }
     
     public static int getTotalEmployee() {
    	 return Employee.totalEmployee;
     }
     
     public static double calculateTotalExpense() {
    	 return totalExpense;
    	 
     }
     
     public static void applyRaise(double percentage) {
    	 Employee.totalExpense += Employee.totalExpense * (percentage/100);
    	 
     }
     
     public void updateSalary(double newSal) {
    	 Employee.totalExpense -= this.salary;
    	 this.salary = newSal;
    	 Employee.totalExpense += this.salary;
     }

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}


	public String toString() {
		return ""+this.name+" "+this.id+" "+this.salary;
	}
     
     
     
     
     
     
}
