package codechef;

import java.util.Scanner;

public class WrongAnswer {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b = x.nextInt();
		int c = a-b;
		int d = (c/10)*10+5;
		System.out.println(d);
		x.close();
	}

}
