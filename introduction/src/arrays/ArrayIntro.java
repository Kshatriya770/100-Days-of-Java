package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
//		int[]  marks = new int[5];
		int[] marks = {23,43,53,53,65};
		//we can change the data also via this:
		marks[2] = 655;
		//using loop in arrays
		 for(int i = 0; i<marks.length; i++) {
			 System.out.println(marks[i]);
		 }
		

	}

}
