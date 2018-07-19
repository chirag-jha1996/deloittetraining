

	import java.util.Scanner;

	class FtoC {

		static float Conversion(float ftemp)
			{return (ftemp - 32.0f) * 5.0f / 9.0f;
			}	
	}


	class City{
		private float tempval;
		static int numberOfCities;
		
		public float getTemp() {
			return tempval;
		}
		public void setTemp(float tempval) {
			this.tempval = tempval;
		}
		
		public int numberOfCities() {
			int noc=0;	
			System.out.println("Enter the number of cities");
				Scanner scan = new Scanner(System.in);
				
					do{ noc= scan.nextInt();
						if (noc<=0) {
							System.out.println("Enter valid number");
							System.out.println("Enter the number of cities again: ");
							}
					
						} while (noc<=0); 
				scan.close();
			return noc;
		}
		public void F_Or_C() {
			System.out.println("Temp in Farenheit or Celcius?");
			
			Scanner scan = new Scanner(System.in);
			for(;;) {
			String F_Or_C=scan.nextLine().toLowerCase();
					
			if ((F_Or_C).charAt(0)=='c') {
				System.out.println("Temp entered is: "+getTemp()+"C");
				break;
			}
			else if ((F_Or_C).charAt(0)=='f'){
				System.out.println("Temp entered is:"+FtoC.Conversion(getTemp())+"F");
				break;
			}
			else 
				System.out.println("Wrong type, re-enter: ");
			
			scan.close();
			}
	}	
		public void temperature(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter temp: ");
			float temp = scan.nextFloat();
			setTemp(temp);
			scan.close();
			F_Or_C();
			
	}
		public void checkRange() {
			
		if (getTemp()>60||getTemp()<-10) {
			System.out.println("Warning!");
		}
		else System.out.println("Everything is cool!");
	}
	}


