package gfgcoding;

import java.util.HashSet;
import java.util.Set;

/*given an array , find if there exists a subarray with sum equals to zero
 * n < 10^5
 */

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		int[] a = {2, 1, -3, 4, 2};
		int k = 6;
		boolean found = false;
		
//		for(int i = 0; i < a.length; i++) {
//			int sum = 0;
//			for(int j = i; j<a.length; j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
//
//with the help of the set :::
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum -k)) {
				found = true;
				break;
			}
		}
		
		System.out.println("found "+ found);

	}

}
