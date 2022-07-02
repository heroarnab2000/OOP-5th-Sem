import java.util.Scanner;
import java.lang.Math;

class AreaOverloading {

    public static double calArea(float a, float b, float c) {
        
        double semiperimeter = (a + b + c) / 2;
        return (Math.sqrt( semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)));

    }

    public static double calArea(float l, float b) {
        
        return (double)(l * b);

    }

    public static double calArea(float r) {
        
        return (double)(3.1415926 * r * r);

    }

    public static void display(double TriangleArea, double RectangleArea, double CircleArea) {

        System.out.println("\nThe area of the triangle is: " + TriangleArea + " sq units.");
        System.out.println("The area of the rectangle is: " + RectangleArea + " sq units.");
        System.out.println("The area of the circle is: " + CircleArea + " sq units.");

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        System.out.println("Enter length and breadth of the rectangle: ");
        float length = in.nextFloat();
        float breadth = in.nextFloat();

        System.out.println("Enter radius of the circle: ");
        float radius = in.nextFloat();

        double TriangleArea = calArea(a, b, c);
        double RectangleArea = calArea(length, breadth);
        double CircleArea = calArea(radius);

        display(TriangleArea, RectangleArea, CircleArea);

        in.close();

    }
}