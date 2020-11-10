package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
//		
//		double y = sc.nextDouble();
//		
		String hello = sc.nextLine();
		
		System.out.println(hello);
		sc.close();
	}

}
