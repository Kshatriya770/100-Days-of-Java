package oops.inheritence;

public class Teacher extends Person {
	
	public Teacher(String name) {
		super(name);
		System.out.println("Inside Teacher Constructor");
	}
	
	public void teach() {
		System.out.println(name+" is teaching");
	}
	
	public void eat() {
		super.eat();
		System.out.println("Teacher " +name+ " is eating");
	}
	public static void laughing() {
		System.out.println("Teacher is laughing");
	}


}
