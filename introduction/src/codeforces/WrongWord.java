package codeforces;

import java.util.Scanner;

public class WrongWord {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int t = x.nextInt();
		while(t-->0) {
			int a = x.nextInt();
			String b = x.nextLine();
			int c[] = new int[a];
			StringBuilder input1 = new StringBuilder();
	        input1.append(b);
	        input1 = input1.reverse();
	        System.out.println(input1);
		}
		x.close();
	}

}
