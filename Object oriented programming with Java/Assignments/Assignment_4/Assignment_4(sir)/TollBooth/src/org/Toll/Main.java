package org.Toll;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
	      TollUtil toll = new TollUtil();
    	  int choice;
    		while((choice = toll.menuList(sc)) != 0) {
    			switch(choice) {
    			case 1:toll.acceptRecord(sc);
    				break;
    			case 2:toll.printRecord();
    				break;
    			}
    		}
}
}
