package org.bmi;



public class BmiTracker {
   private double weight;
   private double height;
   private double BMI;
   public double getWeight() {
	return weight;
}
   public void setWeight(double weight) {
	this.weight = weight;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getBMI() {
	return BMI;
}
public void setBMI(double bMI) {
	BMI = bMI;
}

public String toString() {
	return "BmiTracker [weight=" + weight + ", height=" + height + ", BMI=" + BMI + "]";
}
   
   
  
   
}
