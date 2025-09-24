import java.util.*;

public class quadratic {
    public static float disc(float a, float b, float c) {
        return (b * b) - (4 * a * c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        float a = scan.nextFloat();

        System.out.println("Enter the value of b:");
        float b = scan.nextFloat();

        System.out.println("Enter the value of c:");
        float c = scan.nextFloat();

        if (a <= 0) {
            System.out.println("The solutions dont exist");
        } else {
            float d = disc(a, b, c);

            if (d > 0) {
                System.out.println("The solutions are real and distinct");
                double s1 = (-b + Math.sqrt(d)) / (2 * a);
                double s2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("The solutions are " + s1 + " and " + s2);
            } else if (d == 0) {
                System.out.println("The solutions are real and equal");
                float s1 = (-b) / (2 * a);
                System.out.println("The solution is " + s1);
            } else {
                System.out.println("The solutions are imaginary");
            }
        }

        scan.close();
    }
}
