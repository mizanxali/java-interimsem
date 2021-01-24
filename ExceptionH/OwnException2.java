import java.lang.Exception;
import java.lang.System;


class DivideByZero extends ArithmeticException {
	public DivideByZero(String message) {
	super(message);
}  
}
//Driver class
class OwnException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	           double x = 5;
	           double y = 0;
	           double z = x/y;
	           //System.out.println(z);      
	        } catch(DivideByZero e) {
	        	
	        	System.out.println("Cannot divide by zero ");
	            System.err.print(e);
	        
	        }
	}

}
		