package ConcreteShapes;

import Shapes.Rectangle;

public class CRectangle extends Rectangle {

	private double length;
	private double breadth;

	public CRectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	public double area() {
		double rectArea = length * breadth;

		return rectArea;
	}

	public double perimeter() {
		double circumference = 2 * (length + breadth);
		return circumference;
	}
}