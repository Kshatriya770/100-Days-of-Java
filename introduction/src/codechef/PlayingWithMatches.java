package codechef;

import java.util.Scanner;

public class PlayingWithMatches {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int t1 = 0;
		int t2 = 0;
		for(int i = 1; i <= t; i++) {
			
			t1 = sc.nextInt();
			t2 = sc.nextInt();
			int sum = t1 + t2;
			int length = String.valueOf(sum).length();
			for(int j = 1; j<= length; j++) {
				System.out.println(sum);
			}
			System.out.println(length);
		}
		sc.close();
	}

}
