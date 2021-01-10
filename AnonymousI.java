//Anonymous class can implement interface.

interface Prize {

	static int points = 0;
public void points();
}

class Points{
	
	public void createClass() {				//it is a method for creating the anonymous class.
		int x = 5;
		
		//defining anonymous class that extends Rewards
		Prize r1 = new Prize() {
		public void points() {
			System.out.println("Your bonus points are : " +points+x);
		}
		};
	r1.points(); // while calling object of anonymous class
	}
}

//Driver class
public class AnonymousI {

	public static void main(String[] args) {
		Points p = new Points();
		p.createClass();
}

}
