package codechef;
import java.util.*;

public class LazyJem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = 0,b = 0,m = 0,sum = 0,ans = 0;
		while(t > 0) {
			n = sc.nextInt(); //no of problems
			b = sc.nextInt(); //break in minutes
			m = sc.nextInt(); //minutes to solve a question
			t--;
		}
		
		while(t > 0) {
			while(n > 1) {
				if(n%2 == 0) {
				sum = (n/2)*m + b;
				ans += sum;
				n = n - (n/2);
				}else {
				sum = ((n+1)/2)*m + b;
				n = n - ((n+1)/2);
				ans += sum;
				}
				m = m*2;
				System.out.println(ans);
			}
			t--;
		}
		System.out.println(ans);

	}

}
