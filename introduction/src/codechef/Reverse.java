package codechef;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int a = sc.nextInt();
			int m=0;
		    while(a!=0){
		    m=m*10+ a%10;
		    a/=10;
		        }
		  System.out.println(m);  
		}

	}

}
