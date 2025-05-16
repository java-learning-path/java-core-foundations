package org.javalearning.core.oop.inheritance.basic;

/**
 * Demonstrates basic object creation and string representation in the Vehicle hierarchy.
 * This class showcases the fundamental aspects of object instantiation and the
 * toString() method implementation across different vehicle types.
 *
 * <p><strong>Demonstration Aspects:</strong>
 * <ul>
 *   <li>Object instantiation for different vehicle types</li>
 *   <li>Usage of constructors with various parameters</li>
 *   <li>Automatic string conversion through toString()</li>
 *   <li>Inheritance-based object representation</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.0
 * @since 1.0
 */
public class BasicVehicleDemo {
    
    /**
     * Executes the basic vehicle creation and toString demonstration.
     * Creates instances of each vehicle type and displays their string
     * representations to showcase inheritance-based object creation.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Basic Object Creation and Printing");
        System.out.println("=================================");
        
        // Create instances of each class
        Vehicle vehicle = new Vehicle("Honda", 2022);
        Car car = new Car("BMW", 2021, 5);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2020, true);

        // Display using toString()
        System.out.println("Basic Vehicle: " + vehicle);
        System.out.println("Car: " + car);
        System.out.println("Motorcycle: " + motorcycle);
        
        // Output explanation
        System.out.println("Note how each toString() implementation:");
        System.out.println("• Includes the class name");
        System.out.println("• Shows all relevant attributes");
        System.out.println("• Maintains a consistent format");
    }
}
