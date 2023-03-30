package studio7;


public class Rectangle {
	private double width;
	private double length;
	private boolean square;
	private double perimeter;
	private double area;
	
	public void Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		if (width == length) {
			this.square = true;
		} else {
			this.square = false;
		}
		this.perimeter = (this.width*2)+(this.length*2);
		this.area = (this.width*this.length);
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getArea() {
		return area;
	}
	

}
