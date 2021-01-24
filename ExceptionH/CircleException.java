/** Set a new radius, use exception handling */
class Circle {  
	double radius;
	
	public void setRadius(double newRadius) {
		if (newRadius >= 0)
			radius =  newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
  	}
	public double circleArea() {
		
		return 3.141*radius*radius;
	}
} // class ends here

public class CircleException {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(3);  //setRadius called.

		double areaC = c1.circleArea();
		System.out.println("Area of Circle:"+areaC);
	}

}
