package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String sort(String str){
	        char[] temp = str.toCharArray();
	        Arrays.sort(temp);
	        return new String(temp);
	    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String z = sc.nextLine();
		while(n-->0){
		    String s = sc.nextLine();
		    String s1, s2;
		    int N = s.length();
		    if (N % 2 == 0){
		        s1 = s.substring(0, N/2);
		        s2 = s.substring(N/2, N);
		    }else{
		        s1 = s.substring(0, N/2);
		        s2 = s.substring((N/2) + 1, N);
		    }
		    s1 = sort(s1);
		    s2 = sort(s2);
		    if (s1.equals(s2))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
		
	}
}
