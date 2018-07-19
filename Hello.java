
public class Hello {

	public void display() {
		System.out.println("Display");
		
	}
	public void accept() {
		Employee e = new Employee();
		e.displayname();
		System.out.println("Accept called");
		
		
	}
	public static void main(String[] args) {
	int i=0;
	int j=2;
	boolean b = (i>j)&&(j++>i);
	System.out.println(j);
	 b= (i>j)&(j++>i);
	System.out.println(j);
	}
	

}
