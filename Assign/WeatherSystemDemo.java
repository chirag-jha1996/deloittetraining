package Assign;
import java.util.*;
public class WeatherSystemDemo {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);//use scanner object

int city = scan.nextInt();//enter the number of cities
for(int i=0;i<city;i++) {// check the tolerance or intolerance level as and when the user enters it
double a = scan.nextDouble();//temperature
String s = scan.next();//C or F

if(s.equals("C"))//compare String values
{
WeatherSystem obj1 = new WeatherSystem(a);//Pass the value as it is if the entered value is in degree celsius	
obj1.displayTolerance();//call the method
}
else if(s.equals("F")) { //compare with Fahrenheit
	double celsius = (5*(a-32))/19;//convert it
	//System.out.println(celsius);
	WeatherSystem obj2 = new WeatherSystem(celsius);//call the method
	obj2.displayTolerance();
}
}
}
}