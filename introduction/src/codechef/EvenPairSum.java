package codechef;

import java.util.Scanner;

public class EvenPairSum {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		while(t-->0) {
			int count = 0;
			int a = x.nextInt();
			int b = x.nextInt();
			for(int i = 1; i <=a; i++) {
				for(int j = 1; j <= b; j++) {
					if((i+j)%2 ==0 ) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		x.close();
	}

}
