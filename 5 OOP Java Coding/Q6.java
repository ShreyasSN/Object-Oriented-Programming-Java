import java.util.ArrayList;
import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numShapes = input.nextInt();

        ArrayList<Object> shapes = new ArrayList<>();

        for (int i = 0; i < numShapes; i++) {
            System.out.print("Enter 1 for Circle, 2 for Rectangle, 3 for Square: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Radius: ");
                    double radius = input.nextDouble();
                    Circle circle = new Circle(radius);
                    shapes.add(new Circle(radius));
                    System.out.printf("The area is %.2f and the perimeter is %.2f\n", circle.calculateArea(),
                    circle.calculatePerimeter());
                    break;
                case 2:
                    System.out.print("Enter Length and Breadth: ");
                    double length = input.nextDouble();
                    double breadth = input.nextDouble();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    shapes.add(new Rectangle(length, breadth));
                    System.out.printf("The area is %.0f and the perimeter is %.0f\n", rectangle.calculateArea(),
                            rectangle.calculatePerimeter());
                    break;
                case 3:
                    System.out.print("Enter Side: ");
                    double side = input.nextDouble();
                    Square square = new Square(side);
                    shapes.add(new Square(side));
                    System.out.printf("The area is %.0f and the perimeter is %.0f\n", square.calculateArea(),
                            square.calculatePerimeter());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.print("Enter the threshold value: ");
        double threshold = input.nextDouble();

        System.out.print("The shapes are ");
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                if (rectangle.calculateArea() > threshold) {
                    System.out.printf("Rectangle(%.0f, %.0f)\n", rectangle.length, rectangle.breadth);
                }
            }
        }

        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                if (circle.calculateArea() > threshold) {
                    System.out.printf("Circle(%.0f)\n", circle.radius);
                }
            }
        }

        for (Object shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                if (square.calculateArea() > threshold) {
                    System.out.printf("Square(%.0f)\n", square.side);
                }
            }
        }

        input.close();
    }
}
