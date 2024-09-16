package org.log;

public class Logger {
      private Logger l;
      private String log = "";
      public Logger getInstance() {
    	  if(this.l == null) {
    		  this.l = new Logger();
    	  }
    	  return this.l;
      }
      
      public void log(String msg) {
    	  log += msg +"\n";
      }
      
      public String getLog() {
    	  return this.log;
      }
      
      public void clearLog() {
    	  this.log = "";
      }
}
