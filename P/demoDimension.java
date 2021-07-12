package JavaNewPractical.P;

import JavaNewPractical.P1.TwoDim;
import JavaNewPractical.P2.ThreeDim;

class demoDimension {
    
    public static void main(String[] args) {
        TwoDim twoD = new TwoDim();
        ThreeDim threeD = new ThreeDim();
        TwoDim referenceV;
        
        // Printing the Origin as the coordinates
        System.out.println("With No Parameters!!!");
        referenceV = twoD;
        System.out.println(referenceV);
        referenceV = threeD;
        System.out.println(referenceV);
        
        twoD = new TwoDim(2, 2);
        threeD = new ThreeDim(3, 3, 3);
        
        // Printing the coordinates using Dynamic Method Dispatch
        System.out.println("\nWith Parameters!!!");
        referenceV = twoD;
        System.out.println(referenceV);
        referenceV = threeD;
        System.out.println(referenceV);
    }
}
