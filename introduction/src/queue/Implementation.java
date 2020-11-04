package queue;

public class Implementation {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(33);
		mq.enqueue(77);
		mq.enqueue(88);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(90);
		System.out.println(mq.dequeue());

	}

}
