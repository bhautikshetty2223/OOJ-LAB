import java.util.Scanner;

public class IndexOut{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the number of items: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] items = new String[n];
            System.out.print("Enter your items: ");
            for (int i = 0; i < n; i++) {
                items[i] = sc.nextLine();
            }

            System.out.print("Enter an index to access: ");
            int index = sc.nextInt();

            System.out.println("Item: " + items[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}
