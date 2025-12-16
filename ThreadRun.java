package LAB;

/*
class CollegeThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("BMS College of Engineering ");
                Thread.sleep(10000);
            }
        }
        catch (InterruptedException ie) {
            System.out.println("Caught.");
        }
    }
}

class CourseThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException ie) {
            System.out.println("Caught.");
        }
    }
}

public class ThreadRun {
    public static void main(String[] args) {
        CollegeThread clgThrd = new CollegeThread();
        CourseThread crsThrd = new CourseThread();

        clgThrd.start();
        crsThrd.start();
    }
}
    */

class CollegeThread extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 3; i++) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException ie){
            System.out.println("CAUGHT");
        }
    }
}

class CourseThread extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException ie){
            System.out.println("CAUGHT");
        }
    }
}

public class ThreadRun{
    public static void main(String[] args) {
        CollegeThread clgThrd = new CollegeThread();
        CourseThread crsThrd = new CourseThread();

        clgThrd.start();
        crsThrd.start();
    }
}
