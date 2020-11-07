package dataTypes;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no:");
		int x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}

}
