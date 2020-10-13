package oops;

class Vehicle{
	int wheels;
	int headLights;
	
	Vehicle(int noOfWheels){
		wheels = noOfWheels;
		headLights = 2;
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

	}

}
