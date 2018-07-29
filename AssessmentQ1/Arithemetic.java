package AssessmentQ1;

public abstract class Arithemetic {
private double num1;//declaring variables
private double num2;
public abstract double calculate(double num1, double num2);//abstract calculate method
public double getNum1() {//getter for Num1
	return num1;
}
public void setNum1(double num1) {//setter for num1
	this.num1 = num1;
}
public double getNum2() {//getter for num2
	return num2;
}
public void setNum2(double num2) {//setter for num2
	this.num2 = num2;
}
public Arithemetic(double num1, double num2) {//constructor for arithemetic
	super();
	this.num1 = num1;
	this.num2 = num2;
}

}
