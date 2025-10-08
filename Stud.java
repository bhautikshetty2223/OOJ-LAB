import java.util.*;

class Student{
    String usn;
    String name;
    int[] credits;
    float[] marks;
    int num;

    void accept(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the usn:");
        usn = scanner.nextLine();
        System.out.println("Enter the name:");
        name = scanner.nextLine();
        System.out.println("Enter the number of subjects:");
        num = scanner.nextInt();

        credits = new int[num];
        marks = new float[num];

        for (int i=0; i<num; i++){
            System.out.println("For subject "+(i+1)+" :");
            System.out.println("Enter credits:");
            credits[i] = scanner.nextInt();

            System.out.println("Enter marks:");
            marks[i] = scanner.nextFloat();
        }
    }

    float sgpa(){
        int gradepoints=0;
        int totalcreds=0;

        for (int i=0; i<num; i++){
            int gradepoint = gpoints(marks[i]);
            gradepoints += gradepoint*credits[i];
            totalcreds += credits[i];
        }

        return (float) gradepoints/totalcreds;
    }

    int gpoints(float marks){
        if (marks>=90)
            return 10;
        else if (marks>=80)
            return 9;
        else if (marks>=70)
            return 8;
        else if (marks>=60)
            return 7;
        else if (marks>=50)
            return 6;
        else if (marks>=40)
            return 5;
        else if (marks>=30)
            return 4;
        else if (marks>=20)
            return 3;
        else
            return 0;
    }

    void display(){
        System.out.println("\nDetail:");
        System.out.println("USN: "+usn);
        System.out.println("Name: "+name);
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.println("Subject " + (i + 1));
            System.out.println("Marks = " + marks[i]);
            System.out.println("Credits = " + credits[i]);
            System.out.println("");
        }

        double s = sgpa();
        System.out.println("SGPA: "+s);
    }
}

public class Stud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        student.accept();
        student.display();

        scanner.close();
    }
}