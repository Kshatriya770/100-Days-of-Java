package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class Lue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		int c = 0;
		while(c!= 42) {
			a.add(c);
			c = sc.nextInt();
		}
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		sc.close();

	}

}
