import java.util.*;

public class OoopsPractice {
    public static void main(String args[]) {
       try {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        System.out.println(c1.Sum(c2));
        System.out.println(c1.diff(c2));
        System.out.println(c1.product(c2));
        c1.printComplex();
        c2.printComplex();
       } catch (Exception e) {
        System.out.println(e);
       }
    }

}

class ComplexNumber {
    private double real; // Real part
    private double imaginary; // imaginary part

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public ComplexNumber Sum(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber diff(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber product(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }

    public void printComplex() {
        if (this.real == 0 && this.imaginary != 0) {
            System.out.println(this.imaginary + 'i');
        } else if (this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
        } else {
            System.out.println(this.real + " + " + this.imaginary + "i");
        }
    }

}
