class OperatorsDemo {
	public static void main(String args[]) {
		int a = 15;  
		int b = 5;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("Increment Decrement Operators:");
		System.out.println("a after incrementing = " + ++a);
		System.out.println("b after decrementing = " + --b);

		System.out.println("Arithmetic Operators:");
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a*b = " + (a*b)); 
		System.out.println("a/b = " + (a/b));
		System.out.println("a%b = " + (a%b));
		
		int c = 120;
		System.out.println("Logical Operators:");
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b||a<c);//false || true = true
		
		System.out.println("Ternary Operator:");
		int min=(a<b)?a:b;  
		System.out.println("Minimum between a and b = " + min);
	}
}

