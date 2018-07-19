package Inheritance;

abstract class Vehicle {
public abstract void A();
public abstract void B();
public void C() {
	System.out.println("LOLLOLLLLL");
}
}
class car extends Vehicle{
	public void A() {
		System.out.println("A");
	}
	public void B() {
		System.out.println("B");
	}

  public static void main(String[] args) {
	Vehicle v = new car();
	v.A();
	v.B();
	v.C();
	
}

}

