class Square
{
	
	int sa;
	int square_area(int side) {
		sa = side*side;
		return sa;
	}
}
class Circle
{
	double pi=3.141;
	double c_area, circum;
	double circle_area(float radius) {
		c_area = pi*radius*radius;
		return c_area;
		}
	double circle_circum(float radius){
		circum = 2*pi*radius;
		return circum;
	}
}
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();               //the object of class Square is created.
		int answer = s1.square_area(3);        //method of Square class is called.
		System.out.println("The area of square = "+answer);
		
		Circle c1 = new Circle();
		double c_area = c1.circle_area(3);
		System.out.println("The area of circle = "+ c_area);

		
	}
}
