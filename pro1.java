import java.util.Scanner;

class Shape {

    // Area of Circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    // Area of Rectangle
    void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Area of Triangle
    void area(float base, float height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

public class program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        s.area(radius);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        s.area(length, breadth);

        // Triangle
        System.out.print("Enter base of triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter height of triangle: ");
        float height = sc.nextFloat();
        s.area(base, height);

        sc.close();
    }
}
