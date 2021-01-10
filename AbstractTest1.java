//Concept of abstract class where object of abstract base class holding reference of sub-class.
abstract class Vehicle
{
   public abstract void engine();         // abstract method
}

class Car extends Vehicle {

    public void engine()						//method overridden
    {
        System.out.println("Car engine");
        // car engine implementation
    }
    
}

class Bus extends Vehicle {
	public void engine() {
		System.out.println("Bus engine");
	}
}
public class AbstractTest1 {
	public static void main(String[] args)
    {
        Vehicle v = new Car();
        v.engine();
        
        Vehicle v1 = new Bus();
        v1.engine();
    }
}
