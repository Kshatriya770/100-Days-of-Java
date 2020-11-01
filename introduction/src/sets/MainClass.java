package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet<>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		
		//doesn't add duplicates elements e.g.:
		System.out.println(fruits.add("Mango"));
		
		System.out.println(fruits);

	}

}
