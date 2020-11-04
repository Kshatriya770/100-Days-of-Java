package comparablesAndComparators;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Saurabh"));
		students.add(new Student(24, "Siddartha"));
		students.add(new Student(26, "Saurabh"));
		students.add(new Student(27, "Manav"));
		students.add(new Student(27, "Subodh"));
		
		Collections.sort(students, new SortByNameThenMarks());
		
		students.forEach(System.out::println);
		
	}
}

class SortByNameThenMarks implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks - o2.marks;
		}else {
			return o1.name.compareTo(o2.name);
		}
	}
}
