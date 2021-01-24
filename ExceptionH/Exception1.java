import java.lang.ArithmeticException;
import java.util.Scanner;
class Exception1 {

	public static void main(String[] args) {
			//int a = 12;
			//int b = 0;
			Scanner s = new Scanner(System.in);
			//int c = a/b;
			double z = 0;
			//System.out.println("Output = "+c);
			double x = s.nextDouble();
			try {
			double y = s.nextDouble();
			if (y!=0) 
				z = x/y;
			else
				throw new ArithmeticException();	
		} 
		catch (ArithmeticException e){
				System.out.println("Something is wrong.");
		}
		//exception handling
		System.out.println("Output = "+z);
		System.out.print("Hello");
	} 
}
