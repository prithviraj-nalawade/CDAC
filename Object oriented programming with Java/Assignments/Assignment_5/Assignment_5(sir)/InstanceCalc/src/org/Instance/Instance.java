package org.Instance;

public class Instance {
   private static int instance;
   
   public Instance() {
	   instance++;
   }
   
   public static int getInstance() {
	   return Instance.instance;
   }
   
   public String toString() {
	   return "Instance created: "+Instance.getInstance();
   }
}
