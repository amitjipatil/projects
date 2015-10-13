package ConcreteShapes;

import Shapes.Cylinder;

public class CCylinder extends Cylinder {

	private static final double PI = 3.1415;

	private double radius;
	private double height;

	public CCylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double area() {
		double cylArea = 2 * PI * radius * (radius + height);
		return cylArea;
	}

	@Override
	public double perimeter() {
		double cylVol = PI * radius * radius * height;
		return cylVol;

	}

	public double volume() {
		double cylVol = PI * radius * radius * height;
		return cylVol;
	}

}
