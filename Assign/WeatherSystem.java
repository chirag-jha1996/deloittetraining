package Assign;

public class WeatherSystem {
double c;
	public WeatherSystem(double c) { //constructor for taking temperature
	this.c=c;
}
	public void displayTolerance() {//Method for displaying 
	if(c>60||c<-10) {
		System.out.println("Intolerant");
	}
	else 
		System.out.println("Tolerant");
}
}
