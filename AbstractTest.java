//abstract superclass / abstract class and abstract method.
abstract class A
{
  abstract void callme(); 			//abstract method
  void showme() {
	  System.out.println("I am non abstract method of abstract Base class");	//non-abstract method
  }
}

class Abs extends A
{
  void callme()								//method is redefined.
  {
    System.out.println("Calling...A.");
  }
}
class Bb extends A {
	void callme() {								//method is redefined.		
		System.out.println("Calling...B.");	
	}
}
public class AbstractTest {					
	public static void main(String[] args)
	  {
	 //A a1 = new A();               //we cannot instantiate the abstract class.
	
	 	Abs abs = new Abs();
	    abs.callme();					// output=?
	    abs.showme();                 //calling non-abstract method of abstract class.
	    Bb bb = new Bb(); 			
	    bb.callme();				//output=?
	    bb.showme();				//output=?
	     
	    //b.show();
	  }
}
