package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(23);
		ad.addLast(45);
		ad.addFirst(44);
		
		ad.pop();
		System.out.println(ad.peek());
		System.out.println(ad);
		
		ad.push(42);
		ad.push(34);
		ad.pop();
		System.out.println(ad);

	}

}
