import java.util.Scanner;

class IncrementDecrement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to increment");
		int num1 = sc.nextInt();

		System.out.println("Enter a number to decrement");
		int num2 = sc.nextInt();

		System.out.println("Number after incrementing = " + ++num1);

		System.out.println("Number after decrementing = " + --num2);	
	}
}
		