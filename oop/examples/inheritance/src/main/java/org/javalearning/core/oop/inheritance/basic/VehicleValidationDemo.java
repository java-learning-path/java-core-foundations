package org.javalearning.core.oop.inheritance.basic;

/**
 * Demonstrates input validation mechanisms in the Vehicle hierarchy.
 * This class showcases how constructors implement defensive programming
 * through parameter validation and exception handling.
 *
 * <p><strong>Validation Aspects Demonstrated:</strong>
 * <ul>
 *   <li>Null and empty string validation for brand names</li>
 *   <li>Numeric range validation for years and door numbers</li>
 *   <li>Exception handling patterns for validation failures</li>
 *   <li>Inheritance-based constructor validation chains</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.0
 * @since 1.0
 */
public class VehicleValidationDemo {
    
    /**
     * Executes various validation scenarios to demonstrate proper input checking.
     * Attempts to create invalid vehicle instances to showcase how the constructors
     * protect against invalid data through exceptions.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Demonstrating Input Validation");
        System.out.println("============================");
        
        // Test 1: Empty brand validation
        System.out.println("Test 1: Attempting to create a vehicle with empty brand");
        try {
            Vehicle invalidVehicle = new Vehicle("", 2023);
            System.out.println("This will not print due to exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✖ Validation caught: " + e.getMessage());
        }
        
        // Test 2: Null brand validation
        System.out.println("Test 2: Attempting to create a vehicle with null brand");
        try {
            Vehicle invalidVehicle = new Vehicle(null, 2023);
            System.out.println("This will not print due to exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✖ Validation caught: " + e.getMessage());
        }
        
        // Test 3: Invalid year validation
        System.out.println("Test 3: Attempting to create a vehicle with negative year");
        try {
            Vehicle invalidVehicle = new Vehicle("Toyota", -2023);
            System.out.println("This will not print due to exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✖ Validation caught: " + e.getMessage());
        }
        
        // Test 4: Invalid number of doors
        System.out.println("Test 4: Attempting to create a car with invalid door number");
        try {
            Car invalidCar = new Car("Toyota", 2020, -1);
            System.out.println("This will not print due to exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✖ Validation caught: " + e.getMessage());
        }
        
        // Demonstrate successful creation
        System.out.println("Creating a valid vehicle instance:");
        Vehicle validVehicle = new Vehicle("Toyota", 2023);
        System.out.println("✓ Successfully created: " + validVehicle);
    }
}
