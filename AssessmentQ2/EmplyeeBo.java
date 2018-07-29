package AssessmentQ2;

public class EmplyeeBo {
public void calIncomeTax(EmplyeeVo Vo) {
	if(Vo.getAnnualIncome()<500000&&Vo.getAnnualIncome()>250000)
		Vo.setIncomeTax(Vo.getAnnualIncome()*0.05);//Income tax for 10% bracket
	else if(Vo.getAnnualIncome()>1000000)
		Vo.setIncomeTax(Vo.getAnnualIncome()*0.3);//Income tax for 30% bracket
	else if(Vo.getAnnualIncome()>500000&&Vo.getAnnualIncome()<1000000)
		Vo.setIncomeTax(Vo.getAnnualIncome()*0.05);//Income tax for 5% bracket
}
}
