package AssessmentQ3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		//Scanner scan1 = new Scanner(System.in);//Scanner object 
		System.out.println("Enter the length of the array");
		int lengthOfArray = scan.nextInt();
		//scan.close();
		if(lengthOfArray<3)//if length of array is less than 3, input again
			System.out.println("FALSE");
		else {
			System.out.println("Enter each element of the array");
		int [] a = new int[lengthOfArray];//initializing array 
		for(int i=0; i<lengthOfArray;++i) {
		a[i]=scan.nextInt();
		}
		
	        System.out.println(UserMainCode.CheckTripplets(a));//Method call: TRUE if there are tripplets and FALSE if not  // TODO code application logic here
		}
	}

}
