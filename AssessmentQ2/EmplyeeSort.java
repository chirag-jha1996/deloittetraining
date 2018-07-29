package AssessmentQ2;

import java.util.Comparator;

public class EmplyeeSort implements Comparator<EmplyeeVo> {

	public int compare(EmplyeeVo Vo1, EmplyeeVo Vo2) {
		if(Vo1.getIncomeTax()>Vo2.getIncomeTax()) {
			return -1;
		}
		else if (Vo1.getIncomeTax()<Vo2.getIncomeTax()) {
			return 1;
		}
		else
			return 0;
		// TODO Auto-generated method stub
		
	}


	

	
	

}
