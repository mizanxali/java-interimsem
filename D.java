//Program to understand inheritance / subclass concept, super keyword.
// Parent or Base class
class B	{
	int a;
	float b;
	void Show(){
		System.out.println("b in super class: " + b);
	}
}

// Sub class or derived class
class D extends B{
	int a;
	float b;
	D ( int p, float q) {
		a = p;
		super.b = q;
	}

	void Show(){

		super.Show(); // Show() of super class called.

		System.out.println("b in super class: " + super.b);
		System.out.println("a in sub class: " + a);
	}

	public static void main(String[] args){
		D subobj = new D(1, 5);
		subobj.Show();  //Show of subclass D is called.

		boolean x = subobj instanceof B;
		System.out.println(x);
	}
}

