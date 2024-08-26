import java.util.Scanner;
class DiscountCalc{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter purchase amount:");
		int purchase = s.nextInt();
		int total = 0;
		System.out.println("Has membership (y/n):");
		char member = s.next().charAt(0);
		
		if(purchase>=1000){
			if(member == 'y'){
				total = purchase * 5/100;
                System.out.println("Total discount:"+total);
			}
			total = purchase * 20/100;
			System.out.println("Total discount:"+total);
		}
		else if(purchase>=500 && purchase<=999){
			if(member == 'y'){
				total = purchase * 5/100;
			}
			total = purchase * 10/100;
			System.out.println("Total discount:"+total);
		}
		else if(purchase<500){
			if(member == 'y'){
				total = purchase * 5/100;
			}
			total = purchase * 5/100;
			System.out.println("Total discount:"+total);
		}
		else if(member == 'y'){
				System.out.println("Total discount:"+total);
		}
		else{
			System.out.println("Tota");
		}
	}
}