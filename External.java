package SEE;

import CIE.Personal;  // Import from CIE package

public class External extends Personal {
    public int[] seeMarks = new int[5]; // SEE marks for 5 courses

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void getMarks(int[] marks) {
        if (marks.length == 5) {
            for (int i = 0; i < 5; i++) {
                seeMarks[i] = marks[i];
            }
        } else {
            System.out.println("Error: Please enter 5 SEE marks!");
        }
    }

    public void displayMarks() {
        System.out.print("SEE Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(seeMarks[i] + " ");
        }
        System.out.println();
    }
}
