import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select (Rectangle, Circle, Triangle, Square) or type 'exit' to quit:");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            Shape shape = null;

            switch (choice.toLowerCase()) {
                case "rectangle":
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle("Rectangle", width, height);
                    break;
                case "circle":
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle("Circle", radius);
                    break;
                case "triangle":
                    System.out.print("Enter the length of the first side of the triangle: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of the second side of the triangle: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of the third side of the triangle: ");
                    double side3 = scanner.nextDouble();
                    shape = new Triangle("Triangle", side1, side2, side3);
                    break;
                case "square":
                    System.out.print("Enter the length of a side of the square: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square("Square", sideLength);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            if (shape != null) {
                System.out.println("Shape: " + shape.name);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
            }
        }

        System.out.println("Program completed.");
        scanner.close();
    }
}