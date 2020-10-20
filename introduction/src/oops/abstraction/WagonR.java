package oops.abstraction;

public class WagonR extends Car{
	
	public void acceletate() {
		System.out.println("WagonR is accelerating");
	}
	
	public void breaking() {
		System.out.println("Ola break is applied");
	}

	@Override
	public void accelerate() {
		System.out.println("WagonR is Accelerating");
		
	}

}
