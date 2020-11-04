package loops;

public class ForLoops {

	public static void main(String[] args) {
		for(int i = 0 ; i < 100; i = i +1) {
			System.out.println("Hello World " + i);
		}
		
		for(int i = 0; i <= 100; i = i+2) {
			System.out.println(" even no "+ i);
		}
		int sum = 0;
		int n = 5;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
			System.out.println(sum);
			
			for(int i = 100; i>0;i--) {
				System.out.println(i);
			}
	}

}
