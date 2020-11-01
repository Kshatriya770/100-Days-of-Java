package sets;

import java.util.HashSet;
import java.util.Set;

public class SetsExamples {

	public static void main(String[] args) {
		Set<Integer> x = new HashSet<>();
		x.add(12);
		x.add(45);
		x.add(6);
		
		Set<Integer> y = new HashSet<>();
		y.add(45);
		y.add(89);
		y.add(34);
		//for union
		//x.addAll(y);
		
		//for intersection
		x.retainAll(y);
		System.out.println(x);

	}

}
