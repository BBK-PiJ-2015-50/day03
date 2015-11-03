
import java.util.Scanner;

public class Ex12 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println ("Enter x co-ordinate for point 1: ");
        double xco = input.nextDouble();
        System.out.println ("Enter y co-ordinate for point 1: ");
        double yco = input.nextDouble();
        Point pt1 = new Point();
        pt1.x = xco;
        pt1.y = yco;
        double dist1 = Math.sqrt((xco*xco) + (yco*yco));
        System.out.println ("Point 1 distance = " + dist1);
        System.out.println ("Enter x co-ordinate for point 2: ");
        xco = input.nextDouble();
        System.out.println ("Enter y co-ordinate for point 2: ");
        yco = input.nextDouble();
        Point pt2 = new Point();
        pt2.x = xco;
        pt2.y = yco;
        double dist2 = Math.sqrt((xco*xco) + (yco*yco));
        System.out.println ("Point 2 distance = " + dist2);
        System.out.println ("Enter x co-ordinate for point 3: ");
        xco = input.nextDouble();
        System.out.println ("Enter y co-ordinate for point 3: ");
        yco = input.nextDouble();
        Point pt3 = new Point();
        pt3.x = xco;
        pt3.y = yco;
        double dist3 = Math.sqrt((xco*xco) + (yco*yco));
        System.out.println ("Point 3 distance = " + dist3);
    }
    static class Point {
        double x;
        double y;
    }
}