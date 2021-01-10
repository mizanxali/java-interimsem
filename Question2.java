import java.util.Scanner;

class Question2 {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        for(int i=0; i<n1; i++)
            System.out.print("*");

        System.out.println("");

        for(int i=0; i<n2; i++)
            System.out.print("*");

        System.out.println("");

        for(int i=0; i<n3; i++)
            System.out.print("*");

        System.out.println("");

        for(int i=0; i<n4; i++)
            System.out.print("*");

        System.out.println("");

        for(int i=0; i<n5; i++)
            System.out.print("*");
	}
}