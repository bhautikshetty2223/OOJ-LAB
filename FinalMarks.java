import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            students[i] = new External(usn, name, sem);
            internals[i] = new Internals();

            System.out.println("Enter internal marks for 5 courses (out of 50):");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = sc.nextInt();
            }
            internals[i].getMarks(internalMarks);

            System.out.println("Enter SEE marks for 5 courses (out of 100):");
            int[] seeMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = sc.nextInt();
            }
            students[i].getMarks(seeMarks);
            sc.nextLine(); 
        }

        System.out.println("\n--- Final Marks of Students ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
            System.out.println("Final Marks in 5 Subjects:");
            for (int j = 0; j < 5; j++) {
                double finalMark = internals[i].internalMarks[j] + (students[i].seeMarks[j] / 2.0);
                System.out.print(finalMark + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
