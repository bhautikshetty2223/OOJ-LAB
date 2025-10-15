package Week3;

class ComplexNumber{
    double real;
    double imaginary;

    public ComplexNumber(double r, double i){
        real= r;
        imaginary = i;
    }
}

class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        double rsum = c1.real+c2.real;
        double isum = c1.imaginary+c2.imaginary;
        return new ComplexNumber(rsum,isum);
    }  
}

public class Calc {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        int sumInt = cal.add(10, 20);
        System.out.println("Sum of integers: " + sumInt);

        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);

        ComplexNumber sumComplex = cal.add(c1, c2);

        System.out.println("Sum of complex numbers: " + sumComplex.real + " + " + sumComplex.imaginary + "i");
    }
}
