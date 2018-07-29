package AssessmentQ3;
public class UserMainCode {
	  public static boolean  CheckTripplets(int [] a){//CheckTripplets method for checking tripplets
	        for(int i = 0; i<a.length-2;){
	         if(a[i]==a[i+1]){   //check for every index
	             i++;
	             
	             if(a[i]==a[i+1])
	                 break;
	             else continue;
	         }   
	         //continue through the whole loop
	         return false;
	        }
	             return true;// return true if value at 3 indices are the same
	    }
}
