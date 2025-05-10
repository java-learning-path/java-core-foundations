package org.javalearning.core.oop.inheritance.basic;

/* 
 * Subclasses (Car)
 * 
 * Analyze:
 * 
 *      Determine unique attributes per subclass, Car: numDoors, Motorcycle: hasSideCar.
 * 
 * Do Not Forget:
 *      
 *      Call super(brand, year) constructor.
 *      Include parent fields using getBrand()/getYear() in toString():
 *          "Car{brand='" + getBrand() + "', year=" + getYear() + ", numDoors=" + numDoors + "}"  
 * 
 * Improve:
 * 
 *      Declare subclass fields final — Immutability.
 *      Keep names concise (e.g., numDoors over numberOfCarDoors).
 *      Consider adding defaults (e.g., hasSideCar = false).
 */

public class Car extends Vehicle {
    private final int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        if (numDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numDoors = numDoors;
    }
    
    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", year=" + getYear() + 
                ", numDoors=" + numDoors +
                "}";
    }
}
