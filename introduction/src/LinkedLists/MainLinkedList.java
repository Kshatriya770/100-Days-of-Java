package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		getTimeDiff(al);
		getTimeDiff(ll);
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		
//		System.out.println(ll);
//		System.out.println(ll.get(2));
//		
//		ll.toArray();
//		System.out.println(ll);
		
		System.out.println(ll.get(1));

	}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 0 ; i < 10000000; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + " --> " +(end - start));
	}

}
