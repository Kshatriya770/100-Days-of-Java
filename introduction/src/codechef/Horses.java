package codechef;

import java.util.Scanner;
import java.util.*;

public class Horses {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		while(t-->0) {
			int m = 0;
			int N = x.nextInt();
			int a[] = new int[N];
			for(int i =0; i <N; i++) {
				a[i] = x.nextInt();
			}
			Arrays.sort(a);
			m = a[1] - a[0];
			for(int i = 1; i < N; i++) {
				if(a[i] - a[i-1] < m) {
					m = a[i] - a[i-1];
				}
			}
			System.out.println(m);
		}
		x.close();
	}

}
