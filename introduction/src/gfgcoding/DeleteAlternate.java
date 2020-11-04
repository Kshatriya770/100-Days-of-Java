package gfgcoding;

import java.util.Scanner;

public class DeleteAlternate {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a > 0)
		{
		    String s = sc.next();
		    StringBuilder sb = new StringBuilder("");
		    for(int i=0;i<s.length();i+=2)
		    {
		        sb.append(s.charAt(i));
		    }
		    System.out.println(sb.toString());
		    a--;
		}
	
	}

}
