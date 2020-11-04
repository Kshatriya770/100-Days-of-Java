package oops.finalKeyword;

public class Student {
	
	int rollNo;
	String name;
	
	public final void getDescription() {
		System.out.println("The student name is " +name);
	}
}
