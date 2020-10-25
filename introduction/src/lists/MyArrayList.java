package lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		//ArrayList<String> fruits = new ArrayList();    or
		List<String> fruits = new ArrayList<>();
		List<String> vegetables = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		
		vegetables.add("bhindi");
		vegetables.add("satputiya");
	
		fruits.addAll(vegetables);
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
		
		System.out.println(fruits.get(3));
		
		fruits.set(3, "ghewda");
		fruits.remove(2);
		
		
		System.out.println(fruits);
		
		System.out.println(fruits.contains("Apple"));
		System.out.println(fruits.contains("mango"));
		
		//to remove list
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		toRemove.add("Orange");
		fruits.removeAll(toRemove);
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		fruits.clear();
		System.out.println(fruits);
		System.out.println(fruits.isEmpty());
		
		
		Pair<String, Integer> p1 = new Pair<String, Integer>("Saurabh", 656);
		Pair<Boolean, String> p2 = new Pair<Boolean, String>(true, "Hello");
		
		p1.getDescription();
		p2.getDescription();
	}

}
