package codechef;

import java.util.Scanner;

public class Vaccine {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int D1 = x.nextInt();
		int V1 = x.nextInt();
		int D2 = x.nextInt();
		int V2 = x.nextInt();
		int P = x.nextInt();
		int A,V,D;
		
		if(D1>D2) {
			A = D1-D2;
			V = A*V2;
			D = D2;
		}else {
			A = D2-D1;
			V = A*V1;
			D = D1;
		}
		
		while(P > V) {
			V = V + V1 + V2;
			D = D + 1;
		}
		System.out.println(D-1);
		x.close();
	}

}
