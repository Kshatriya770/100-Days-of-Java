package oops.packages.models;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	//to give restriction to other class inside a packages
	//the public class can accessed anywhere
	private String getPassword() {
		return "skadjf;aio";
	}
	
	String getRandom() {
		return "kjfg;";
	}

}
