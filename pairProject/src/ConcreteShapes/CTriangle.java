package ConcreteShapes;

import Shapes.Triangle;

public class CTriangle extends Triangle {

	private double base;
	private double height;

	public CTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		double triArea = 0.5 * (base * height);
		return triArea;
	}

	@Override
	public double perimeter() {

		return 0;
	}

}
