package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 55;
		int c = 70;
		
		int result = 0;
		
//		if(a>b) {
//			if (a>c) {
//				result = a;
//			}
//			else 
//				result = c;
//		} else {
//			if(b>c) {
//				result = b;
//			} 
//			else {
//				result = c;
//			}
//		}
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("the greater no is : " +result);
	}

}
