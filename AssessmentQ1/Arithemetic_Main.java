package AssessmentQ1;

import java.util.Scanner;

public class Arithemetic_Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your choice");
	int choice = scan.nextInt();//1 for addition 2 for subtraction 3 for multiplication 4 for division
	if(choice<0||choice>4)
		System.out.println("Invalid, try again");
	else {
	System.out.println("enter the 2 numbers");
	double num1 = scan.nextDouble();
	double num2 = scan.nextDouble();
	/*Creating an array of references that would call the method in each
	 * subclass.
	 * The choice entered can then be used to call the specific object.
	 */
	Arithemetic ref1 = new Addition(num1,num2);
	Arithemetic ref2 = new Subtraction(num1,num2);
	Arithemetic ref3 = new Multiplication(num1,num2);
	Arithemetic ref4 = new Division(num1,num2);
	Arithemetic[] arr = {ref1, ref2, ref3, ref4};
	System.out.println("The answer for the given choice is "+arr[choice-1].calculate(num1, num2));
	}
	
	
}
}
