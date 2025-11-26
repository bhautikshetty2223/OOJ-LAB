import java.util.*;

public class DivByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int b = sc.nextInt();

            double result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
