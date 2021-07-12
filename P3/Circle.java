package JavaNewPractical.P3;

import JavaNewPractical.P1.Shape;

public class Circle extends Shape {
    
    // Default Constructor calling the default super constructor
    public Circle() {
        super();
    }
    
    // Parameterized Constructor calling parameterized super constructor
    public Circle(double radius) { 
        super(radius);
    }
    
    // Overriding area() to calculate the area of rectangle
    public double area() {
        return 2 * 3.14 * dimension1;
    }
}
