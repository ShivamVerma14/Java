package JavaNewPractical;

import java.util.Scanner;

class Complex {
    int real;
    int imaginary;
    
    // Constructor to initialise the value of real and imaginary parts
    Complex() {
        real = 0;
        imaginary = 0;
    }
    
    // Parameterized constructor to initialise the values of real and imaginary parts
    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }
    
    // Copy Constructor to clone an object into another
    Complex(Complex object) {
        real = object.real;
        imaginary = object.imaginary;
    }
    
    // Function to add two complex numbers
    Complex add(Complex object) {
        Complex temp = new Complex();
        temp.real = real + object.real;
        temp.imaginary = imaginary + object.imaginary;
        return temp;
    }
    
    // Function to multiply two complex numbers
    Complex multiply(Complex object) {
        Complex temp = new Complex();
        temp.real = real * object.real - imaginary * object.imaginary;
        temp.imaginary = real * object.imaginary + imaginary * object.real;
        return temp;
    }
    
    // Overloading toString() to return the values of an object
    public String toString() {
        return (real + " + i" + imaginary);
    }
}

public class demoComplex {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int real_temp = 0, imaginary_temp = 0;
        char choice = 'N';
        do {
            System.out.println("Enter the real and imaginary part of first Complex Number: ");
            real_temp = input.nextInt();
            imaginary_temp = input.nextInt();
            Complex firstNumber = new Complex(real_temp, imaginary_temp);
            System.out.println("Enter the real and imaginary part of second Complex Number: ");
            real_temp = input.nextInt();
            imaginary_temp = input.nextInt();
            Complex secondNumber = new Complex(real_temp, imaginary_temp);
            Complex addNumber = firstNumber.add(secondNumber);
            Complex mulNumber = firstNumber.multiply(secondNumber);
            System.out.println("First Number: " + firstNumber);
            System.out.println("Second Number: " + secondNumber);
            System.out.println("Resultant of Addition: " + addNumber);
            System.out.println("Resultant of Multiplication: " + mulNumber + '\n');
            System.out.print("Do you want to operate more (Y/N): ");
            choice = input.next().charAt(0);
        }while(choice == 'Y' || choice == 'y');
    }
}
