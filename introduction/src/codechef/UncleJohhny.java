package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohhny {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		int c = 0,d = 0,count =0;
		while(t-->0) {
			int N = x.nextInt();
			int a[] = new int[N];
			for(int i = 0;i<N; i++ ) {
				a[i] = x.nextInt();
			}
			int K = x.nextInt();
			c = K - 1;
			d = a[c];
			Arrays.sort(a);
			for(int i = 0; i < N; i++) {
				if(a[i] == d) {
					break;
				}else {
					count++;
				}
			}
			System.out.println(count+1);
		}
		x.close();
	}

}
