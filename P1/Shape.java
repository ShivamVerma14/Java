package JavaNewPractical.P1;

public abstract class Shape {
    protected double dimension1;
    protected double dimension2;
    
    // Default Constructor to initialise the instance variable
    public Shape() {
        dimension1 = 0;
        dimension2 = 0;
    }
    
    // 1st Parameterized Constructor to initialise the instance variable
    public Shape(double dim1, double dim2) {
        dimension1 = dim1;
        dimension2 = dim2;
    }
    
    // 2nd Parameterized Constructor to initialise the instance variable
    public Shape(double dim) {
        dimension1 = dimension2 = dim;
    }
    
    // An abstract method to return the area of the shape
    public abstract double area();
}
