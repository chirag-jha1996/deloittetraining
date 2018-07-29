package AssessmentQ2;

public class EmplyeeVo {
private int empid;
private String empName;
private double AnnualIncome;
private double IncomeTax;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getAnnualIncome() {
	return AnnualIncome;
}
public void setAnnualIncome(double annualIncome) {
	AnnualIncome = annualIncome;
}
public double getIncomeTax() {
	return IncomeTax;
}
public void setIncomeTax(double incomeTax) {
	IncomeTax = incomeTax;
}
@Override
public String toString() {
	return "EmplyeeVo [empid=" + empid + ", empName=" + empName + ", AnnualIncome=" + AnnualIncome + ", IncomeTax="
			+ IncomeTax + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(AnnualIncome);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(IncomeTax);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((empName == null) ? 0 : empName.hashCode());
	result = prime * result + empid;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmplyeeVo other = (EmplyeeVo) obj;
	if (Double.doubleToLongBits(AnnualIncome) != Double.doubleToLongBits(other.AnnualIncome))
		return false;
	if (Double.doubleToLongBits(IncomeTax) != Double.doubleToLongBits(other.IncomeTax))
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	if (empid != other.empid)
		return false;
	return true;
}
public EmplyeeVo(int empid, String empName, double annualIncome, double incomeTax) {
	super();
	this.empid = empid;
	this.empName = empName;
	AnnualIncome = annualIncome;
	IncomeTax = incomeTax;
}


}
