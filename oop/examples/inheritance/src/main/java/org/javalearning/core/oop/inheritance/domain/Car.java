package org.javalearning.core.oop.inheritance.domain;

/**
 * Represents a specialized vehicle type implementing car-specific attributes and behaviors.
 * This class extends the base Vehicle class, demonstrating inheritance principles and
 * specialized validation requirements. It maintains the immutability contract established
 * by its parent class while adding car-specific features.
 * 
 * <p><strong>Inheritance Implementation:</strong>
 * Demonstrates proper inheritance practices through:
 * <ul>
 *   <li>Extension of base vehicle functionality</li>
 *   <li>Proper constructor chaining using super()</li>
 *   <li>Maintaining immutability contracts</li>
 * </ul>
 * 
 * <p><strong>Domain Specificity:</strong>
 * Adds car-specific attributes and validation:
 * <ul>
 *   <li>Number of doors as a distinguishing feature</li>
 *   <li>Validation of car-specific constraints</li>
 *   <li>Proper encapsulation of new attributes</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.2
 * @since 1.2
 */
public class Car extends Vehicle {
    private final int numDoors;

    private static final int MIN_CAR_DOORS = 1;
    private static final int MAX_CAR_DOORS = 6;

    /**
     * Constructs a new Car instance with complete parameter validation and immutable state initialization.
     * This constructor extends the vehicle initialization process with car-specific validation
     * and state management.
     *
     * <p>The construction process ensures:
     * <ul>
     *   <li>Base vehicle properties are properly initialized through super()</li>
     *   <li>Number of doors meets logical constraints (between {@code 1} and {@code 6}, inclusive)</li>
     *   <li>Immutability is maintained for all fields</li>
     * </ul>
     *
     * @param brand the manufacturer brand of the car
     * @param year the manufacturing year of the car
     * @param numDoors the number of doors the car has
     * @throws IllegalArgumentException if numDoors is not between 1 and 6 (inclusive), or if brand/year validation fails
     */
    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        if (numDoors < MIN_CAR_DOORS || numDoors > MAX_CAR_DOORS) {
            throw new IllegalArgumentException("Number of doors must be between " + MIN_CAR_DOORS + " and " + MAX_CAR_DOORS);
        }
        this.numDoors = numDoors;
    }
    
    /**
     * Retrieves the number of doors this car has.
     * This accessor method maintains the class's immutability contract while
     * providing access to car-specific attributes.
     *
     * @return the number of doors as an integer, guaranteed to be positive
     */
    public int getNumDoors() {
        return numDoors;
    }
    
    /**
     * Overrides the base startEngineViaKey method to provide car-specific starting behavior.
     * Simulates a car-specific key detection and engine start sequence.
     *
     * @return true if the car engine started with the key, false otherwise
     */
    @Override
    public boolean startEngineViaKey() {
        boolean carKeyDetected = true; // Replace with car-specific key detection logic
        boolean engineReady = true; // Replace with car-specific engine readiness check
        return carKeyDetected && engineReady;
    }

    /**
     * Overrides the base startEngineRemotelyViaKeyBob method to provide car-specific remote start behavior.
     * Simulates a car-specific remote signal detection and engine start sequence.
     *
     * @return true if the car engine started remotely via key bob, false otherwise
     */
    @Override
    public boolean startEngineRemotelyViaKeyBob() {
        boolean carRemoteSignalReceived = true; // Replace with car-specific remote signal detection
        boolean engineReady = true; // Replace with car-specific engine readiness check
        return carRemoteSignalReceived && engineReady;
    }

    /**
     * Overrides the base startEngineViaApp method to provide car-specific app-based starting behavior.
     * Simulates a car-specific app command detection and engine start sequence.
     *
     * @return true if the car engine started using the app, false otherwise
     */
    @Override
    public boolean startEngineViaApp() {
        boolean carAppCommandReceived = true; // Replace with car-specific app command detection
        boolean engineReady = true; // Replace with car-specific engine readiness check
        return carAppCommandReceived && engineReady;
    }

    /**
     * Provides a string representation of this car, extending the base vehicle
     * representation with car-specific attributes.
     *
     * <p>The output format follows the pattern:
     * Car{brand='brandValue', year=yearValue, numDoors=doorsValue}
     *
     * @return a formatted string representation of the car's complete state
     */
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + "'" +
                ", year=" + getYear() + 
                ", numDoors=" + numDoors +
                "}";
    }
}
