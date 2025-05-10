package org.javalearning.core.oop.inheritance.basic;

/* 
 * Subclasses (Motorcycle)
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

public class Motorcycle extends Vehicle {
    private final boolean hasSideCar;

    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }
    
    public boolean getHasSideCar() {
        return hasSideCar;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + getBrand() + '\'' +
                ", year=" + getYear() +
                ", hasSideCar=" + hasSideCar +
                "}";
    }
}
