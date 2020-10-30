package gfgcoding;

import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {
		boolean isBalanced = true;
		char ch = 0;
		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- !=0) {
		String s = sc.nextLine();
		
			
			
			
			for (int i = 0; i<s.length(); i++) {
				ch = s.charAt(i);
				if(ch == '(' || ch == '{' || ch == '[') {
					stack.push(ch);
					continue;
				}
			}
			if(ch == ')') {
				if(stack.peek() == '(') {
					stack.pop();
				}else {
					isBalanced = false;
					break;
				}
			}
			if(ch == '}') {
				if(stack.peek() == '{') {
					stack.pop();
				}else {
					isBalanced = false;
					break;
				}
			}
			if(ch == ']') {
				if(stack.peek() == '[') {
					stack.pop();
				}else {
					isBalanced = false;
					break;
				}
			}
		}
		if(!stack.isEmpty()) {
			isBalanced = false;
		}
		if(isBalanced) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}

	}

}
