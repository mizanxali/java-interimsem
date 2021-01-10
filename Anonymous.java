//Anonymous class: extending the class.
abstract class Rewards {
	static int points = 0;
	abstract void points(); 
}

class BonusPoints{   
		public void createClass() {	//it is a method for creating the anonymous class.
		int x = 5;
		//defining anonymous class that extends Rewards
		Rewards r1 = new Rewards() {
		public void points() {
			System.out.println("Your bonus points are : " +points+x);
		}
		};
		
		r1.points();     // while calling object of anonymous class
	}
}
//Driver class
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Rewards.points);
		BonusPoints bp = new BonusPoints();   //object of concrete class
		bp.createClass();
	}
}