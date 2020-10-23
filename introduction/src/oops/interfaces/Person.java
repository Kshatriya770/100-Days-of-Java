package oops.interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		 Youtuber obj1 = obj;
		 obj1.editVideo();
		 obj1.makeVideo();
		

	}

	@Override
	public
	void study() {
		System.out.println("Person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making a good video");
		
	}

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		
	}

}
