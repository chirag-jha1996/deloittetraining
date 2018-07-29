package AssessmentQ1;

public class Addition extends Arithemetic{


public Addition(double num1, double num2) {//constructor call
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

public double calculate(double num1, double num2) {//overridden calculate method for addition
	return num1+num2;
}
}
