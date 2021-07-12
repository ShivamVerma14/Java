package JavaNewPractical;

import java.util.Scanner;
import JavaNewPractical.P1.Shape;
import JavaNewPractical.P2.Rectangle;
import JavaNewPractical.P3.Circle;

public class demoArea {
    
    public static void main(String[] args) {
        Shape referenceV;
        int choice;
        double length, breadth, radius, area;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("\tMENU");
        System.out.println("1. Rectangle\n2. Circle");
        System.out.print("Choose the Shape: ");
        choice = input.nextInt();
        
        switch(choice) {
            case 1: System.out.println("Enter the length and breadth of the Rectangle... ");
                    length = input.nextDouble();
                    breadth = input.nextDouble();
                    referenceV = new Rectangle(length, breadth);
                    area = referenceV.area();
                    System.out.println("Area: " + area);
                    break;
            case 2: System.out.println("Enter the radius of the Circle... ");
                    radius = input.nextDouble();
                    referenceV = new Circle(radius);
                    area = referenceV.area();
                    System.out.println("Area: " + area);
                    break;
            default: System.out.println("Wrong Choice of Order!!!");
        }
    }
            
}
