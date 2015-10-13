package ConcreteShapes;

import Shapes.Square;

/**
 * @author amit
 *
 */
public class CSquare extends Square {

	private double side;

	public CSquare(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		double sqArea = side * side;
		return sqArea;
	}

	@Override
	public double perimeter() {
		double circumference = 4 * side;
		return circumference;
	}

}
