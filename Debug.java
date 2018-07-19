

	import java.util.Scanner;

	class FtoC {

		static double Conversion(double ftemp)
			{
			return (ftemp - 32.0f) * 5.0f / 9.0f;
			}	
	}


	class City{
		private double tempval;
		static int numberOfCities;
		
		public double getTemp() {
			return tempval;
		}
		public void setTemp(double tempval) {
			this.tempval = tempval;
		}
		
		public int numberOfCities() {
			int noc=0;	
			System.out.println("Enter the number of cities");
				Scanner scan1 = new Scanner(System.in);
				
					do{ noc= scan1.nextInt();
						if (noc<=0) {
							System.out.println("Enter valid number");
							System.out.println("Enter the number of cities again: ");
							}
					
						} while (noc<=0); 
				scan1.close();
			return noc;
		}
		public void F_Or_C() {
			System.out.println("Temp in Farenheit or Celcius?");
			
			Scanner scan1 = new Scanner(System.in);
			for(;;) {
			String F_Or_C=scan1.nextLine().toLowerCase();
					
			if ((F_Or_C).charAt(0)=='c') {
				System.out.println("Temp entered is: "+getTemp()+"C");
				
			}
			else if ((F_Or_C).charAt(0)=='f'){
				System.out.println("Temp entered is:"+FtoC.Conversion(getTemp())+"F");
				
			}
			else 
				System.out.println("Wrong type, re-enter: ");
			
			
			}
	}	
		public void temperature(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter temp:");
		   String temp = scan.next();
		   double a = Double.parseDouble(temp);
		    System.out.println(temp);
			setTemp(a);
			scan.close();
			F_Or_C();
			
	}
		public void checkRange() {
			
		if (getTemp()>60||getTemp()<-10) {
			System.out.println("Warning!");
		}
		else System.out.println("Everything is cool!");
	}
public static void main (String[] args) {
			
			City city = new City();
			int noOfCities=city.numberOfCities();
			for (int i = 0; i < noOfCities; i++) {
				
				city.temperature();
				city.checkRange();
		}
	
	
	}
	}


