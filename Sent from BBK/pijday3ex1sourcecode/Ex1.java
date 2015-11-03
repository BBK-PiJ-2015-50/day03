
import java.util.Scanner;

public class Ex1 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println ("enter 1st number");
        double num1 = input.nextDouble();
        System.out.println ("1st number is " + num1);
        System.out.println ("enter 2nd number");
        double num2 = input.nextDouble();
        System.out.println ("2nd number is " + num2);
        System.out.println ("Choose a mathematical operation");
        System.out.println ("ADDITION (1), SUBTRACTION (2), MULTIPLICATION (3) or DIVISION (4)");
        int calc = input.nextInt();
        switch (calc) {
            case 1:
                System.out.println ("addition");
                System.out.println (num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println ("subtraction");
                break;
            case 3:
                System.out.println ("multiplication");
                break;
            case 4:
                System.out.println ("division");
                break;
            default:
                break;
        }
    }
}