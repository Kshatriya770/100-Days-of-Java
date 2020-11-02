package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {
	
	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
//		numbers.put("one ", 1);
//		numbers.put("two ", 2);
//		numbers.put("five ", 5);
//		
//		numbers.putIfAbsent("one ", 4);
//		
//		System.out.println(numbers.get("one "));
//		System.out.println(numbers.containsKey("two "));
//		System.out.println(numbers.containsValue(5));
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet());
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		
//		numbers.remove("one ");
//		
//		
//		System.out.println(numbers);
//		
		System.out.println(getHash("CAT"));
		System.out.println(getHash("DOG"));
		System.out.println(getHash("GOD"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i <s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
