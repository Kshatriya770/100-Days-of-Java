package dslab;

import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		while(t-->0) {
			int m = x.nextInt();
			int n = x.nextInt();
			int a[] = new int[m];
			int b[] = new int[n];
			
			for(int i= 0; i<m; i++) {
				a[i] = x.nextInt();
			}
			for(int j= 0; j<n; j++) {
				b[j] = x.nextInt();
			}
			int o = m + n;
			int c[] = new int[o];
			for(int i = 0; i<m;i++) {
				c[i] = a[i];
			}
			for(int i = 0; i<n; i++) {
				c[i+m] = b[i];
			}
			
			for(int i = 0; i<=o; i++) {
				System.out.println(c[i]);
			}
		}

	}

}
