
public class MainStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="Hello"+" World";
		string.concat(" & Goodbye!");
		
		StringBuilder strinBuilder=new StringBuilder("Hello World");
		strinBuilder.append(" & Goodbye!!");
		printInformation(string);
		printInformation(strinBuilder);
		System.out.println("This is update 3.");
		System.out.println("This is update 4.");
		

	}
	
	public static void printInformation(String string) {
		
		System.out.println("String ="+string);
		System.out.println("Length = "+string.length());
	}
	
	public static void printInformation(StringBuilder strinBuilder) {
		
		System.out.println("String Builder ="+strinBuilder);
		System.out.println("Length = "+strinBuilder.length());
	}

}
