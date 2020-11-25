package codechef;

import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		while(t-->0) {
			int G = x.nextInt();
			while(G-->0) {
				int I = x.nextInt();
				int N = x.nextInt();
				int Q = x.nextInt();
				int ans = N/2;
				if(N%2 == 0) {
					System.out.println(ans);
				}else if(I == Q) {
					System.out.println(ans);
				}else {
					System.out.println(ans +1);
				}
				
			}
		}
		x.close();
	}

}
