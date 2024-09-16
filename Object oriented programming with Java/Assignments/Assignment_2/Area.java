import java.util.Scanner;
class Area{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = s.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("Area of the Circle: " + circleArea);
                break;

            case 2:
                System.out.println("Enter the side length of the square:");
                double side = s.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of the Square: " + squareArea);
                break;

            case 3:
                System.out.println("Enter the length of the rectangle:");
                double length = s.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = s.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of the Rectangle: " + rectangleArea);
                break;

            case 4:
                System.out.println("Enter the base of the triangle:");
                double base = s.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = s.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the Triangle: " + triangleArea);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }
	}
}