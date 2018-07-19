package deloitte;
 public class Project{
	 int p=0;
	 public void disp(int p, int m){
		 System.out.println("Adding two numbers :"+(p+m));
	 }
	 public void disp(){
		 System.out.println("no Addition");
	// TODO Auto-generated method stub

}
	 public void disp(int...num) {
		 for(int i:num)
			 System.out.println(i);
	 }
	 public static void main(String[] args) {
		 Project customer =new Project();
		 customer.disp(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,2,22,2,2,2,2,2,2,2,2,2,22,2,2,22,2,2,2,2,2,2,2,2,2,22,2,2,2);
	 }
}
