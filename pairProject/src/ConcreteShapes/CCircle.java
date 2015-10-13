package ConcreteShapes;

import Shapes.Circle;

public class CCircle extends Circle {

	private double radius;
	

	public CCircle(double radius) {
		this.radius = radius;
	}

	public double area() {
		double cirArea =PI * radius * radius;
		return cirArea;

	}

	public double perimeter() {
		double circumference = 2 * PI * radius;
		return circumference;
	}

}
