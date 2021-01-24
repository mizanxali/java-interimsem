import java.lang.Exception;
import java.lang.System;

class MyException extends Exception {
	public MyException(String message) {
	super(message);
}  
}
//Driver class
class OwnException {

	public static void main(String[] args) {
		try {
	        String customerId= null;
			if(customerId == null) {
				throw new MyException("Customer Id Cannot be null ");
			}
		} 
		catch(MyException e) {
			System.err.print(e);
		}
	}

}
		