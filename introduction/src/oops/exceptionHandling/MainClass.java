package oops.exceptionHandling;



public class MainClass {

	public static void main(String[] args) {
		try {
			int a= 5;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " occured please check your code");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("message");
		}finally { //this will always run no matter what
			System.out.println("sorry try again");
		}
		//multiple catch can be used in the 
		
		System.out.println("Very important code");
		
		fun1();

	}
	
	static void fun1() {
		
		
//		int a= 5;
//		int b = 0;
//		int c = a/b;
//		
//		System.out.println(c);
		
	}

}
