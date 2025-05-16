package org.javalearning.core.oop.inheritance.basic;

/**
 * Demonstrates polymorphic behavior in the Vehicle class hierarchy.
 * This class showcases various aspects of polymorphism including method overriding,
 * runtime type identification, and type-safe casting.
 *
 * <p><strong>Polymorphism Aspects Demonstrated:</strong>
 * <ul>
 *   <li>Using parent type references for child objects</li>
 *   <li>Runtime type identification with instanceof</li>
 *   <li>Safe type casting techniques</li>
 *   <li>Method overriding behavior</li>
 *   <li>Collection of different vehicle types in an array</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.0
 * @since 1.0
 */
public class VehiclePolymorphismDemo {
    
    /**
     * Executes various demonstrations of polymorphic behavior in the vehicle hierarchy.
     * Shows how parent class references can handle different types of vehicles and
     * how to safely work with vehicle subtypes.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Demonstrating Polymorphism");
        System.out.println("========================");
        
        // Create an array of vehicles (polymorphic container)
        Vehicle[] vehicles = {
            new Vehicle("Generic Brand", 2022),
            new Car("BMW", 2021, 4),
            new Motorcycle("Harley Davidson", 2020, true),
            new Car("Toyota", 2023, 2),
            new Motorcycle("Ducati", 2022, false)
        };
        
        // Demonstrate polymorphic iteration
        System.out.println("1. Basic Polymorphic Iteration");
        System.out.println("Each vehicle uses its own toString() implementation:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("► " + vehicle);
        }
        
        // Demonstrate instanceof and casting
        System.out.println("2. Type Checking and Specific Behavior");
        for (Vehicle vehicle : vehicles) {
            System.out.print("Processing: " + vehicle.getBrand());
            
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println(" ➜ Car with " + car.getNumDoors() + " doors");
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println(" ➜ Motorcycle" + 
                    (motorcycle.getHasSideCar() ? " with sidecar" : " without sidecar"));
            } else {
                System.out.println(" ➜ Basic vehicle");
            }
        }
        
        // Demonstrate polymorphic method calls
        System.out.println("3. Polymorphic Method Behavior");
        processVehicle(new Vehicle("Generic", 2022));
        processVehicle(new Car("Mercedes", 2023, 4));
        processVehicle(new Motorcycle("Yamaha", 2021, false));
    }
    
    /**
     * Demonstrates polymorphic method behavior by processing any type of vehicle.
     * This method shows how the same code can work with different vehicle types.
     *
     * @param vehicle any type of vehicle (demonstrates polymorphic parameter)
     */
    private static void processVehicle(Vehicle vehicle) {
        System.out.println("Processing vehicle: " + vehicle.getClass().getSimpleName());
        System.out.println("• Type: " + vehicle.getClass().getSimpleName());
        System.out.println("• ToString: " + vehicle);
        System.out.println("• Brand: " + vehicle.getBrand());
        System.out.println("• Year: " + vehicle.getYear());
    }
}
