package methods;

public class IntroductionToMethods {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result = maxOf(firstNumber, secondNumber);
		
		maxOf(5);
		
		System.out.println(result);
		
		sayHi();
	}
	
	static int maxOf(int a, int b) {
		
	if(a>b ) {
		return a;
	}else {
		return b;
	}
		
	}
	
	static void maxOf(float c) {
		
	}
	
	static void sayHi() {
		System.out.println("Thanks for joining");
		System.out.println("Have a good Day");
	}

}
