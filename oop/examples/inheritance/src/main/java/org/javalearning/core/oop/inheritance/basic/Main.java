package org.javalearning.core.oop.inheritance.basic;

/* 
 * This Main class demonstrates a basic Vehicle inheritance hierarchy with:
 * 1. Basic object instantiation and toString() behavior
 * 2. Input validation using IllegalArgumentException
 * 3. Usage of getter methods across the hierarchy
 * 4. Polymorphism through an array of Vehicle objects
 * 
 * The example shows how all objects share common Vehicle properties while
 * each subclass adds its own specific attributes and behaviors.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("BASIC OBJECT CREATION AND PRINTING");
        System.out.println("----------------------------------");
        // Create instances of each class
        Vehicle vehicle = new Vehicle("Honda", 2022);
        Car car = new Car("BMW", 2021, 5);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 2020, true);

        // Display using toString()
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(motorcycle);
        
        // Expected Output:
        // Vehicle{brand='Honda', year=2022}
        // Car{brand='BMW', year=2021, numDoors=5}
        // Motorcycle{brand='Harley Davidson', year=2020, hasSideCar=true}
        
        System.out.println("\nDEMONSTRATING VALIDATION");
        System.out.println("----------------------");
        // Demonstrate validation with try-catch blocks
        try {
            Vehicle invalidVehicle = new Vehicle("", 2023);
            System.out.println("This will not print due to exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        
        try {
            Car invalidCar = new Car("Toyota", 2020, -1);
            System.out.println("This will not print due to exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        
        System.out.println("\nUSING GETTER METHODS");
        System.out.println("------------------");
        // Demonstrate using getters
        System.out.println("Vehicle brand: " + vehicle.getBrand() + ", year: " + vehicle.getYear());
        System.out.println("Car brand: " + car.getBrand() + ", year: " + car.getYear() + 
                          ", number of doors: " + car.getNumDoors());
        System.out.println("Motorcycle brand: " + motorcycle.getBrand() + ", year: " + motorcycle.getYear() + 
                          ", has sidecar: " + motorcycle.getHasSideCar());
        
        System.out.println("\nDEMONSTRATING POLYMORPHISM");
        System.out.println("------------------------");
        // Demonstrate polymorphism with an array of Vehicle objects
        Vehicle[] vehicles = {vehicle, car, motorcycle};
        
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle info: " + v);
            
            // Instance type checking and specific behavior
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("  This is a car with " + c.getNumDoors() + " doors");
            } else if (v instanceof Motorcycle) {
                Motorcycle m = (Motorcycle) v;
                System.out.println("  This is a motorcycle" + 
                                  (m.getHasSideCar() ? " with a sidecar" : " without a sidecar"));
            } else {
                System.out.println("  This is a basic vehicle");
            }
        }
    }
}
