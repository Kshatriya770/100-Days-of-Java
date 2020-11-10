package codechef;

import java.util.Scanner;

public class FlatLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int N = sc.nextInt();
			int count = 0;
			while(N>0) {
				int num = (int)Math.sqrt(N);
				N -= (num*num);
				count++;
			}
			System.out.println(count);
		}
          sc.close();

	}

}
