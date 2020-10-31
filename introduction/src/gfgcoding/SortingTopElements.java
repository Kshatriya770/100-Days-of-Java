package gfgcoding;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SortingTopElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- !=0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i = 0; i<n; i++) {
				if(i<k) {
					pq.add(a[i]);
				}else {
					if(pq.peek() < a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans, Collections.reverseOrder());
			
			for(int x: ans) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
