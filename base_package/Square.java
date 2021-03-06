package base_package;

public class Square extends Rectangle{
	private double side;
	
	Square(){
		
	}
	Square(double side){
		this.side = side;
	}
	Square(double side, String color, boolean filled){
		this.side = side;
		this.color = color;
		this.filled = filled;
	}
	double getSide(){
		return side;
	}
	void setSide(double side) {
		this.side = side;
	}
	void setWidth(double side) {
		this.width = side;
	}
	void setLength(double side) {
		this.length = side;
	}
	public String toString() {
		Rectangle rectangle = new Rectangle(side, side);
		return "Side = "+side+"\n"+"Area = "+rectangle.getArea()+"\n"+"Perimeter = "+rectangle.getPerimeter()+"\n";
	}
}
