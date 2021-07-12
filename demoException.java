package JavaNewPractical;

import java.util.Scanner;

class UnderAge extends Exception {
    private int age;
    
    // Default Constructor
    UnderAge(int age) {
        this.age = age;
    }
    
    // Overloading toString() to retrieve the age
    public String toString() {
        return ("Underage: " + age);
    }
}

public class demoException  {
    
    // Test() to test the age
    static void test(int age) throws UnderAge {
        System.out.println("Entered Test()...");
        if(age < 18)
            throw new UnderAge(age);
        System.out.println("Exiting Test()...");
    }
    
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = input.nextInt();
        try {
            test(age);
        }
        catch(UnderAge UA) {
            System.out.println("Exception Caught:: " + UA);
        }
    }
}
