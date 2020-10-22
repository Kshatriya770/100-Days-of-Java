package oops.finalKeyword;

public class MainClass extends Student{
	//overriding the class available in Student class
	
	//final method cannot be override so this will give the error 
//	public void getDescription() {
//		System.out.println("inside main class");
//	}
	
	
	//final class cannot be extended
	
	
	
//	final int ROLL_NO = 4;

	public static void main(String[] args) {
		
//		final Student obj = new Student();
//		Student obj1 = new Student();
//		//only way to reference the final value
//		obj.name = "Saurabh";
		
		MainClass obj = new MainClass();
		
		obj.getDescription();
		

	}

}
