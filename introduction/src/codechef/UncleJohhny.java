package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohhny {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		int c = 0,d = 0;
		while(t-->0) {
			int N = x.nextInt();
			int a[] = new int[N];
			for(int i = 0;i<N; i++ ) {
				a[i] = x.nextInt();
			}
			int K = x.nextInt();
			c = a[K+1];
			Arrays.sort(a);
			for(int i=0; i<N; i++) {
				if(c == a[i]) {
					break;
				}else {
					d += 1;
				}
			}
			System.out.println(d+1);
		}
	}

}
