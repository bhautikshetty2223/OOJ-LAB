import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        String filename = sc.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
