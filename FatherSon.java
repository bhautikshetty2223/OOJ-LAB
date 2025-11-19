import java.util.*;

class WrongAge extends Exception {
    public WrongAge(String m) {
        super(m);
    }
}

class Father {
    int FatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        this.FatherAge = age;
        System.out.println("Father's age: " + age);
    }
}

class Son extends Father {
    int SonAge;

    Son(int FatherAge, int SonAge) throws WrongAge {
        super(FatherAge);

        if (SonAge >= FatherAge) {
            throw new WrongAge("Son's age can't be more than or equal to the father's");
        }
        this.SonAge = SonAge;
        System.out.println("Son's age: " + SonAge);
    }
}

public class FatherSon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = "y";

        while (ch.equals("y") || ch.equals("Y")) {
            System.out.print("Enter the Father's age: ");
            int fa = sc.nextInt();

            System.out.print("Enter the Son's age: ");
            int sa = sc.nextInt();

            try {
                Son s = new Son(fa, sa);
            } catch (WrongAge e) {
                System.out.println("Exception caught: " + e.getMessage());
            }

            System.out.println("Do you want to continue? (y/n): ");
            sc.nextLine();
            ch = sc.nextLine();
        }
    }
}
