package gfgcoding;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		    char c=sc.next().charAt(0);
		    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }

	}

}

