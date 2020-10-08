package userInput;
import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal");
		int principal = sc.nextInt();
		System.out.println("Rate");
		float rate = sc.nextFloat();
		System.out.println("Enter Time");
		int time = sc.nextInt();
		
		float simpleIntrest = principal * rate * time / 100;
		System.out.println("The simple intrest is " +simpleIntrest);

	}

}