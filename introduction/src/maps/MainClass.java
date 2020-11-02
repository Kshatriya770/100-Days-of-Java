package maps;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one ", 1);
		numbers.put("two ", 2);
		numbers.put("five ", 5);
		
		numbers.putIfAbsent("one ", 4);
		
		System.out.println(numbers.get("one "));
		System.out.println(numbers.containsKey("two "));
		System.out.println(numbers.containsValue(5));
		
		
		
		System.out.println(numbers);
		
	}

}
