package oops;

class Vehicle{
	int wheels;
	int headLights;
	String color;
	
	Vehicle(int noOfWheels){
		wheels = noOfWheels;
		headLights = 2;
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
	}
	
	Vehicle(){
		
	}
}

public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
		MyConstructor obj = new MyConstructor();
		
		Vehicle car = new Vehicle(4);
		System.out.println(car.wheels + " wheels");
		
		Vehicle tempo = new Vehicle(3);
		System.out.println(tempo.wheels +" wheels");
		
		Vehicle scooty = new Vehicle(2, "Pink");
		System.out.println(scooty.wheels + "  wheels and color " + scooty.color);
		
		Vehicle random = new Vehicle();
		System.out.println(random.color);

	}

}
