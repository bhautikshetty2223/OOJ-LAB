import java.util.*;

public class calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first operand:");
        float a = scan.nextInt();

        System.out.println("Enter the second operand:");
        float b = scan.nextInt();
        
        System.out.println();
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        scan.close();
    }
}