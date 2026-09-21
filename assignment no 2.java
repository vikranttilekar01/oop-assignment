import java.util.Scanner;

public class Complex1 {
    double real;
    double imaginary;

    Complex1() {
        real = 0;
        imaginary = 0;
    }

    Complex1(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex1 add(Complex1 c) {
        return new Complex1(real + c.real, imaginary + c.imaginary);
    }

    Complex1 subtract(Complex1 c) {
        return new Complex1(real - c.real, imaginary - c.imaginary);
    }

    Complex1 multiply(Complex1 c) {
        double r = (real * c.real) - (imaginary * c.imaginary);
        double i = (real * c.imaginary) + (imaginary * c.real);
        return new Complex1(r, i);
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Real and Imaginary part of First Complex Number:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.println("Enter