package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		Pet p = d;
		 System.out.println(d.name);
		 System.out.println(p.name);
		
		greeting();
		greeting("Good Morning");
		greeting("WELCOME", 7);

	}
	
	public static void greeting() {
		System.out.println("Hi there!");
	}
	public static void greeting(String s) {
		System.out.println(s);
	}
	public static void greeting(String s, int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(s);
		}
	}

}
