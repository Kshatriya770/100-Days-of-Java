package loops;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result = 0;
		for(float i = 1; i <= n ; i++) {
			result += 1/i;
		}
		System.out.println(result);
	}

}
