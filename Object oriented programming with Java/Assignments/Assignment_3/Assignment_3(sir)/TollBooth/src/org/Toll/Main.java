package org.Toll;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
	  
    	  TollBoothRevenueManager toll = new TollBoothRevenueManager();
    	  toll.setRate(sc);
    	  toll.acceptRecord(sc);
    	  toll.printRecord();
    	  
    	  sc.close();
}
}
