package AssessmentQ2;

import java.util.Arrays;
import java.util.Scanner;

public class EmplyeeMain {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of employees");
	int noOfEmployees = scan.nextInt();//read the number of employees
	EmplyeeVo [] arr = new EmplyeeVo[noOfEmployees];//create an array of objects of employeeVo
	for(int i=0; i<noOfEmployees;i++) {
		System.out.println("Enter the employee ID");
	int empId=scan.nextInt();
	System.out.println("Enter the name of the employee");
	String empName = scan.next();
	System.out.println("Enter the annual income of the employee");
	double annualIncome = scan.nextDouble();
	arr[i] = new EmplyeeVo(empId,empName,annualIncome,0);//initialize the emplyeevo object but incometax calculated would be 0
	}
	EmplyeeBo emp = new EmplyeeBo();//create an EmplyeeBo object
	for(int i=0; i<noOfEmployees;i++) {
		
		emp.calIncomeTax(arr[i]);//For every EmplyeeVo object, calculate the income tax
		
	}
	for(int i=0; i<noOfEmployees;i++) {
		System.out.println("The data of all employees :");
		System.out.println(arr[i]);//Print all the employee information
	}
	EmplyeeSort emp1 = new EmplyeeSort();//create an EmplyeeSort object
	Arrays.sort(arr, emp1);
	for(int i=0; i<noOfEmployees;i++) {
		System.out.println("The sorted array is:");
		System.out.println(arr[i]);//Print the sorted array
	}
		
}
}
