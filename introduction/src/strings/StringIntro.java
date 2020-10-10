package strings;

public class StringIntro {

	public static void main(String[] args) {
		
		String name = "Saurabh Singh";
		String social = "Facebook,Whatsapp,Instagram,Snapchat,Twitter";
		String name3 = new String("Saurabh Singh");
		//checking for equality but not for heap area
		System.out.println(name == name3);
		//same as up but it checks the heap area too
		System.out.println(name.equals(name3));
		//indexing in java
		System.out.println(name.charAt(0));
		//calculating the length of characters in the stored string
		System.out.println(name.length());
		//to print the next characters of the indexed value
		System.out.println(name.substring(5));
		//same as upper but there is a ending index
		System.out.println(name.substring(5, 12));
		//check for the available characters
		System.out.println(name.contains("Singh"));
		//checks if the string is empty or not
		System.out.println(name.isEmpty());
		//concat
		name = name + " Kshatriya";
		System.out.println(name);
		//another example of concat
		System.out.println(name.concat(" i dont know what to add"));
		//replace
		System.out.println(name.replace('a', 'C'));
		//split try replacing the a with other characters
		String allSocial[] = social.split("a");
		for(String socials: allSocial) {
			System.out.println(socials);
		}
		//check for index for any given character
		System.out.println(name.indexOf('u'));
		//change the string to lowercase
		System.out.println(name.toLowerCase());
		//change the string to uppercase
		System.out.println(name.toUpperCase());
		//triming
		String name4 = "      Saurabh       ";
		System.out.println(name4);
		System.out.println(name4.trim());

	}

}
