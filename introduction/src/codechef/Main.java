package codechef;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i<=t;i++) {
		    long t1 = 0;
	        long t2 = 0;
			long N = sc.nextLong();
			int B = sc.nextInt();
			long M = sc.nextLong();
			for(int j = (int)N ; j>=1; j--) {
				if((N%2)!=0) {
					N=(N+1)/2;
					t1 += N*M+B;
				    M=M*2;
					N=N-1;
					if(N==0)
					break;
				}else {
					N=N/2;
				    t2 += N*M+B;
					M=M*2;
				}
			}
		System.out.println((t2+t1-B));
	    }
	  
	}

}
