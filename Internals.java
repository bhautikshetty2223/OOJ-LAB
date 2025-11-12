package CIE;

public class Internals {
    public int[] internalMarks = new int[5]; // Marks for 5 courses

    public void getMarks(int[] marks) {
        if (marks.length == 5) {
            for (int i = 0; i < 5; i++) {
                internalMarks[i] = marks[i];
            }
        } else {
            System.out.println("Error: Please enter 5 internal marks!");
        }
    }

    public void displayMarks() {
        System.out.print("Internal Marks (out of 50): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(internalMarks[i] + " ");
        }
        System.out.println();
    }
}
