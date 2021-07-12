package JavaNewPractical.P2;

import JavaNewPractical.P1.Shape;

public class Rectangle extends Shape {
    
    // Default Constructor calling the default super constructor
    public Rectangle() {
        super();
    }
    
    // 1st Parameterized Constructor calling parameterized super constructor
    public Rectangle(double length, double breadth) { 
        super(length, breadth);
    }
    
    // 2nd Parameterized Constructor calling parameterized super constructor
    public Rectangle(double side) { 
        super(side);
    }
    
    // Overriding area() to calculate the area of rectangle
    public double area() {
        return dimension1 * dimension2;
    }
}
