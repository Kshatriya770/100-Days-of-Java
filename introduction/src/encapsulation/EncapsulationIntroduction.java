package encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		
		
		Student obj = new Student();
		//obj.name = "Saurabh";
		//obj.age = 34;
		//encapsulation:
		obj.setAge(12);
		
		System.out.println(obj.getAge());
		
		
	}

}
