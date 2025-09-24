import java.util.*;

public class volume{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length:");
        float l = scan.nextInt();

        System.out.println("Enter the breadth:");
        float b = scan.nextInt();

        System.out.println("Enter the height:");
        float h = scan.nextInt();

        System.out.println("The volume is: " + (l*b*h));
        scan.close();
    }
}