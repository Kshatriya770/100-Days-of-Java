package oops.abstraction;

public class Audi extends Car{
	
	public void acceletate() {
		System.out.println("Audi is accelerating");
	}
	
	public void breaking() {
		System.out.println("4 chudi break is applied");
	}

	@Override
	public void accelerate() {
		System.out.println("Audi is accelerating");
		
	}


}
