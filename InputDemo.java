import java.io.*;

class InputDemo {
	public static void main(String args[]) throws IOException
	{
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(istream);
		
		System.out.println("Welcome to your first input program");
	
		System.out.println("Enter your name");
		String name = bufRead.readLine();

		System.out.println("Enter the year you were born in");
		String birthYear = bufRead.readLine();

		System.out.println("Enter the current year");
		String currentYear = bufRead.readLine();

		int birthYearInt = Integer.parseInt(birthYear);
		int currentYearInt = Integer.parseInt(currentYear);

		int age = currentYearInt - birthYearInt; 

		System.out.println("Hello " + name + ". You are " + age + " years old.");
	}
}