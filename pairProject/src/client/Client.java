package client;

import mypack.Shape;
import ConcreteShapes.*;
import java.util.Scanner;

/**
 * @author amit, suhas
 *
 */
public class Client {

	public static void main(String[] args) {
		// scanner to take input from user
		Scanner sc = new Scanner(System.in);
		int input = 0;
		do {

			// available choices for Shapes
			System.out.println("1. Rectangle");
			System.out.println("2. Square");
			System.out.println("3. Circle");
			System.out.println("4. Triangle");
			System.out.println("5. Cylinder");
			System.out.println("6. Exit");
			System.out.println("enter your choice");

			// it checks for numberformat exception
			try {

				input = sc.nextInt();
			} catch (NumberFormatException e) {
				System.out.println("please enter number instead of string");
				break;
			}

			switch (input) {
			// takes input from user and calculate area and perimeter of
			// rectangle
			case 1: {
				try {
					System.out.println("enter length and breadth");
					double length = sc.nextDouble();
					double breadth = sc.nextDouble();
					Shape s = new CRectangle(length, breadth);
					System.out.println("area of rectangle = " + s.area());
					System.out.println("perimeter of triangle = "
							+ s.perimeter());
				} catch (NumberFormatException e) {
					System.out.println("please enter number instead of string");
					break;
				}

				break;

			}
			// takes input from user and calculate area and perimeter of square
			case 2: {
				try {
					System.out.println("enter the side of the square");
					double side = sc.nextDouble();
					Shape s = new CSquare(side);
					System.out.println("area of square = " + s.area());
					System.out
							.println("perimeter of square = " + s.perimeter());
				} catch (NumberFormatException e) {
					System.out.println("please enter number instead of string");
					break;
				} catch (Exception e) {
					System.out.println("something went wrong");
					break;
				}

				break;

			}
			// takes input from user and calculate area and perimeter of circle
			case 3: {
				try {
					System.out.println("enter the radius of circle");
					double radius = sc.nextDouble();
					Shape s = new CCircle(radius);
					System.out.println("area of circle = " + s.area());
					System.out
							.println("perimeter of circle = " + s.perimeter());
				} catch (NumberFormatException e) {
					System.out.println("please enter number instead of string");
				} catch (Exception e) {
					System.out.println("something went wrong");
					break;
				}

				break;

			}
			// takes input from user and calculate area and perimeter of
			// triangle
			case 4: {
				try {
					System.out.println("enter the base and height of triangle");
					double base = sc.nextDouble();
					double height = sc.nextDouble();
					Shape s = new CTriangle(base, height);
					System.out.println("area of triangle = " + s.area());
					System.out.println("perimeter of triangle = "
							+ s.perimeter());
				} catch (NumberFormatException e) {
					System.out.println("please enter number instead of string");
				} catch (Exception e) {
					System.out.println("something went wrong");
					break;
				}

				break;

			}
			// takes input from user and calculate area and perimeter of
			// cylinder
			case 5: {
				try {
					System.out
							.println("enter the radius and height of the cylinder");
					double radius = sc.nextDouble();
					double height = sc.nextDouble();
					Shape s = new CCylinder(radius, height);
					System.out.println("area of cylinder = " + s.area());
					System.out.println("volume of cylinder = " + s.perimeter());
				} catch (NumberFormatException e) {
					System.out.println("please enter number instead of string");
				} catch (Exception e) {
					System.out.println("something went wrong");
					break;
				}

				break;

			}
			// to terminate program
			case 6: {
				System.exit(0);
			}
			// if user choose other than test case values
			default:
				System.out.println("wrong choice");

			}

		} while (input != 6);

	}

}
