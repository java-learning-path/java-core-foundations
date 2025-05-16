package org.javalearning.core.oop.inheritance.basic;

/**
 * Demonstrates the getter methods implementation across the Vehicle hierarchy.
 * This class showcases how encapsulation is maintained through proper getter
 * methods while providing access to object properties.
 *
 * <p><strong>Getter Method Aspects Demonstrated:</strong>
 * <ul>
 *   <li>Accessing encapsulated fields through getters</li>
 *   <li>Inheritance of getter methods from parent class</li>
 *   <li>Type-specific getter implementations</li>
 *   <li>Proper naming conventions for boolean getters</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.0
 * @since 1.0
 */
public class VehicleGettersDemo {
    
    /**
     * Executes demonstrations of getter method usage across different vehicle types.
     * Shows how to access properties while maintaining encapsulation through
     * proper getter method calls.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Demonstrating Getter Methods");
        System.out.println("==========================");
        
        // Create instances with specific attributes
        Vehicle vehicle = new Vehicle("Honda", 2022);
        Car car = new Car("BMW", 2021, 5);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2020, true);

        // Demonstrate base Vehicle getters
        System.out.println("Base Vehicle Properties:");
        System.out.println("• Brand: " + vehicle.getBrand());
        System.out.println("• Year: " + vehicle.getYear());
        
        // Demonstrate Car getters (inherited + specific)
        System.out.println("Car Properties (Including Inherited):");
        System.out.println("• Brand: " + car.getBrand());
        System.out.println("• Year: " + car.getYear());
        System.out.println("• Number of Doors: " + car.getNumDoors());
        
        // Demonstrate Motorcycle getters (inherited + specific)
        System.out.println("Motorcycle Properties (Including Inherited):");
        System.out.println("• Brand: " + motorcycle.getBrand());
        System.out.println("• Year: " + motorcycle.getYear());
        System.out.println("• Has Sidecar: " + motorcycle.getHasSideCar());
        
        // Demonstrate getter usage in string formatting
        System.out.println("Formatted Output Using Getters:");
        System.out.printf("► Vehicle: %s (%d)%n", 
            vehicle.getBrand(), vehicle.getYear());
        System.out.printf("► Car: %s (%d) with %d doors%n", 
            car.getBrand(), car.getYear(), car.getNumDoors());
        System.out.printf("► Motorcycle: %s (%d)%s%n", 
            motorcycle.getBrand(), 
            motorcycle.getYear(),
            motorcycle.getHasSideCar() ? " with sidecar" : " without sidecar");
    }
}
