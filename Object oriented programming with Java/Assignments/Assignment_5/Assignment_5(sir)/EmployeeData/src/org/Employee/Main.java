package org.Employee;

public class Main {

	public static void main(String[] args) {
		 Employee e1 = new Employee("ABC", 1, 50000);
	        Employee e2 = new Employee("XYZ", 3, 60000);

	        System.out.println(e1);
	        System.out.println(e2);

	        System.out.println("Total Employees: " + Employee.getTotalEmployee());
	        System.out.println("Total Salary Expense: " + Employee.calculateTotalExpense());

	        Employee.applyRaise(10);
	        System.out.println("After 10% raise:");
	        System.out.println("Total Salary Expense: " + Employee.calculateTotalExpense());

	        e1.updateSalary(70000);
	        System.out.println("After updating:");
	        System.out.println("Total Salary Expense: " + Employee.calculateTotalExpense());

	}

}
