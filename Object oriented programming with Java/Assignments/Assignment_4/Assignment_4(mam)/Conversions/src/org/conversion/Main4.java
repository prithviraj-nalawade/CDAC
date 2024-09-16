package org.conversion;
/*4) Write a Program that demonstrates widening 
 * conversion from int to (double,float, boolean, string)  and prints the result.*/
public class Main4 {

	public static void main(String[] args) {
		int i = 0;
		double d = i;
		float f = i;
//		boolean b = i   //not allowed
		String s = String.valueOf(i);
		System.out.println("Integer to double: "+d);
		System.out.println("Integer to float: "+f);
		System.out.println("Integer to String: "+s);

	}

}
