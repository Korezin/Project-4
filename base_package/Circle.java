package base_package;

public class Circle extends Shape{
	private double radius;
	Circle(){
		
	}
	Circle(double radius){
		this.radius = radius;
	}
	Circle(double radius, String color, boolean filled){
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	double getRadius(){
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "R = "+radius+"\n"+"Area = "+getArea()+"\n"+"Perimeter = "+getPerimeter()+"\n";
	}
}
