package oops.exceptionHandling;

public class Mainclass01 {

	public static void main(String[] args) {
		
		fun1();

	}
	
	static void fun1() {
		int a =5;
		int b  = 3;
		int c = a/b;
		
		System.out.println(c);
		try {
			Thread.sleep(3000); // interupted exceptioin
			fun2();
		} catch(Exception e){
			System.out.println(e.getMessage()+ " we need some dragons");
		}
		
		
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) { //this is used in very rare case try avoiding it
			throw new ArrayIndexOutOfBoundsException("Winter is coming");
		}
	}

}
