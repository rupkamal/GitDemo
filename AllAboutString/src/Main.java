
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printInformation("Hello World");
		/*
		 * printInformation(""); printInformation("/t   /n");
		 */
		
		
		
		

	}
	
	public static void printInformation(String string) {
		
		int length=string.length();
		if(string.isEmpty()) {
			System.out.println("The string is empty.");
		}
		
		if(string.isBlank()) {
			System.out.println("The string is blank.");
		}
		System.out.printf("Length =%d %n", length);
		System.out.printf("First Char =%c %n", string.charAt(0));
		System.out.printf("Last Char =%c %n", string.charAt(length-1));	
		System.out.printf("Last index =%d %n", string.lastIndexOf('l'));	
		System.out.println(string.replaceAll("Hello", "New"));
		System.out.println(string);
		System.out.println("Rup Kamal's update 1.");
		System.out.println("Rup Kamal's update 2");
		
		
	}

}
