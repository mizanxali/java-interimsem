import java.util.Scanner;

class PercentageMarks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks for subject 1");
		int m1 = sc.nextInt();

		System.out.println("Enter marks for subject 2");
		int m2 = sc.nextInt();

		System.out.println("Enter marks for subject 3");
		int m3 = sc.nextInt();
		
		System.out.println("Enter marks for subject 4");
		int m4 = sc.nextInt();

		System.out.println("Enter marks for subject 5");
		int m5 = sc.nextInt();

		System.out.println("Enter total marks for 5 subjects");
		int total = sc.nextInt();

		double percentage = (double)(m1+m2+m3) * 100.00 / (double)total;

		System.out.println("Percentage = " + percentage);
	}
}