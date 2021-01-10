abstract class Shape{
	//abstract void draw();
	abstract void area();
	
}
class Circle1 extends Shape {
	double r;
	Circle1(double r){
		this.r = r ;
	}
	
	public void area() {
		System.out.println("Circle area ="+(3.141*r*r));
	}
	
}
class Rectangle extends Shape {
	int length;
	int breadth;
	Rectangle(int length, int breadth){
		this.breadth = breadth; 
		this.length = length;
	}
	public void area() {
		System.out.println("Rectangle area ="+length*breadth);
	}
	
}
public class Drawing {
 
	public static void main(String[] args) {
		Circle1 c = new Circle1(3.5);
		c.area();
		
		Shape s = new Rectangle(5, 4);
		s.area();
	}
}
