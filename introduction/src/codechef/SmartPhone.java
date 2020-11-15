package codechef;

import java.util.Arrays;
import java.util.Scanner;

class SmartPhone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n;
		n = sc.nextInt();
		long []a = new long [n];
		for(int i =0;i<n;i++)
		{
		    a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long  max = 0;
		for(int i =0;i<n;i++)
		{
		  
		   if(a[i]*(n-i)>max)
		   {max = a[i]*(n-i);}
		}
		System.out.println(max);
		sc.close();
	}

}
