import java.util.Scanner;

public class IT22091598Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        if (radius < 0) {
            System.out.println("Invalid radius. Radius cannot be negative.");
        } else {
            double area = circleArea(radius);

            System.out.println(
                "The area of the circle with radius " + radius + " is: " + area
            );
        }

        scanner.close();
    }
}