package JavaNewPractical.P1;

public class TwoDim {
    private int x;
    private int y;
    
    // Default Constructor to initialise the instance variable
    public TwoDim() {
        x = 0;
        y = 0;
    }
    
    // Parameterized Constructor to initialise the instance variable
    public TwoDim(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }
    
    // Overloading toString() to return the value of the instances
    public String toString() {
        return ("Coordinates: ( " + x + ", " + y + " )");
    }
            
}
