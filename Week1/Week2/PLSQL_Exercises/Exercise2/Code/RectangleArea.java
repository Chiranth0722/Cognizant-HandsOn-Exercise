package packag;

import java.util.Scanner;

public class RectangleArea {

    // Simulated stored procedure for area calculation
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = calculateArea(length, width);
        System.out.println("Area of rectangle: " + area);

        sc.close();
    }
}
