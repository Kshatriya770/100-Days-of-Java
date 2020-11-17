package codechef;
import java.util.*;

public class Arrayreplace{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int sum = 0, m =0,count= 0;
			int a[] = new int[N];
			for(int i = 0; i < N; i++){
				a[i] = sc.nextInt();
				sum = sum + a[i];
			}
			for(int i =0; i<N;i++) {
				m = K + a[i];
				if(m > sum-a[i]) {
					count = count +1;
				}
			}
			System.out.println(count);
			
		}
		sc.close();
	}
}

