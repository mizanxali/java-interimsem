//Program to understand static method & variable.

import java.math.*;

class BiCycle {
    private int cadence; // paddle rate
    private int gear;
    private int speed;
    private int id=0; 
    // add an instance variable for the object ID
    private static int  noOfBicycles = 0;
  
   BiCycle(int c, int g, int s){
    	this.cadence = c;
    	this.gear =g;
    	this.speed = s;
    this.id =	++noOfBicycles; 
    }
     // add a class variable for the
    // number of Bicycle objects instantiated
      public static int getCount() {
    	return noOfBicycles;
    }
    public int getBikeId() {
    	return id;
    }
    
}

public class BiCycleTest {

	public static void main(String[] args) {
		BiCycle b1 = new BiCycle(10,5,20);
		BiCycle b2 = new BiCycle(12,4, 15);
		
		System.out.println(BiCycle.getCount());
		System.out.println(b1.getBikeId());
		System.out.println(b2.getBikeId());
			
		//double y = Math.pow(3,3);
		//double z = Math.log(9);
		//System.out.println(y);
		//System.out.println(z);
	}
	
	
}


