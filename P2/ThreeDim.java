package JavaNewPractical.P2;

import JavaNewPractical.P1.TwoDim;

public class ThreeDim extends TwoDim {
    private int z;
    
    // Default Constructor to initialise the instance variable
    public ThreeDim() {
        super();
        z = 0;
    }
    
    // Parameterized Constructor to initialise the instance variable
    public ThreeDim(int xCoordinate, int yCoordinate, int zCoordinate) {
        super(xCoordinate, yCoordinate);
        z = zCoordinate;
    }
    
    // Overloading toString() to retrieve the value of object
    public String toString() {
        String twoCoordinate;
        twoCoordinate = super.toString();
        twoCoordinate = twoCoordinate.substring(0, twoCoordinate.length() - 2);
        return (twoCoordinate + ", " + z + " )");
    }
}
