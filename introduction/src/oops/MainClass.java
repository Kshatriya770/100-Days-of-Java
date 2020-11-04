package oops;

class Cat{
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void description() {
		System.out.println("my cat has " + legs + " legs and " + eyes + " eyes");
	}
}

class Dog{
	
	String breed, name;
	public void jump() {
		System.out.println("My dog "+ name + " jumped");
	}
	public void description() {
		System.out.println("My dog's name is " + name + " and it's breed is " + breed);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.legs = 3;
		cat1.eyes = 2;
		
		Cat cat2 = new Cat();
		cat2.legs = 4;
		cat2.eyes = 2;
		cat2.description();
		cat1.walk();
		cat2.eat();
		cat1.description();
		
		Dog sheru = new Dog();
		Dog bittu = new Dog();
		
		sheru.breed = "Street";
		sheru.name = "Sheru";
		sheru.jump();
		
		bittu.breed = "Wolf";
		bittu.name = "baghelu";
		bittu.jump();
		
		sheru.description();
		bittu.description();

	}

}
