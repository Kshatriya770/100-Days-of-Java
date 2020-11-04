package vectorsAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		//vector is basically same as array list but this is not efficient so we don't use this instead of Array list

		MyStack<Integer> stack = new MyStack<>();
		stack.push(12);
		stack.push(24);
		stack.push(11);
		stack.push(223);
		
		int popped = stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
		
		

	}

}
