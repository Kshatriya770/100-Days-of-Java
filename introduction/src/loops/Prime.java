package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i*i < n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(n<2) isPrime = false;
System.out.println("is Prime " + isPrime);
	}

}

//dikat
