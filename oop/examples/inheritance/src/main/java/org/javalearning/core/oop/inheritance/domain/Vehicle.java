package org.javalearning.core.oop.inheritance.domain;

import java.time.Year;

/**
 * Represents a foundational vehicle entity implementing core Object-Oriented principles.
 * This class serves as the parent in a vehicle hierarchy, demonstrating several
 * key software engineering concepts:
 * 
 * <p><strong>Immutability:</strong>
 * All fields are declared as final, ensuring that once a Vehicle instance is created,
 * its state cannot be modified. This design choice provides:
 * <ul>
 *   <li>Thread safety without synchronization</li>
 *   <li>Protection against accidental state mutations</li>
 *   <li>Better support for caching and object pooling</li>
 * </ul>
 * 
 * <p><strong>Encapsulation:</strong>
 * Fields are private with controlled access through getter methods, which:
 * <ul>
 *   <li>Hides implementation details from clients</li>
 *   <li>Maintains class invariants</li>
 *   <li>Allows for future implementation changes without affecting clients</li>
 * </ul>
 * 
 * <p><strong>Validation:</strong>
 * Constructor implements defensive programming through parameter validation:
 * <ul>
 *   <li>Null checks for brand parameter</li>
 *   <li>Empty string validation for brand</li>
 *   <li>Logical range checking for year value</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.2
 * @since 1.2
 */
public class Vehicle {
    private final String brand;
    private final int year;

    private static final int EARLIEST_VALID_VEHICLE_YEAR = 1886;

    /**
     * Constructs a new Vehicle instance with input validation and immutable state initialization.
     * This constructor implements defensive programming principles through comprehensive
     * parameter validation and establishes the object's immutable state.
     *
     * <p>The validation process ensures:
     * <ul>
     *   <li>Brand parameter meets non-null and non-empty requirements</li>
     *   <li>Year value is greater than or equal to {@code 1886} (the year of the first automobile)</li>
     *   <li>Year value is not more than 10 years in the future from the current year</li>
     *   <li>Object state consistency through final field initialization</li>
     * </ul>
     *
     * @param brand the manufacturer brand of the vehicle
     * @param year the manufacturing year of the vehicle
     * @throws IllegalArgumentException if brand is null or empty, if year is less than 1886, or if year is more than 10 years in the future
     */
    public Vehicle(String brand, int year) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
        if (year < EARLIEST_VALID_VEHICLE_YEAR) {
            throw new IllegalArgumentException("Year must be >= " + EARLIEST_VALID_VEHICLE_YEAR);
        }
        int currentYear = Year.now().getValue();
        if (year > currentYear + 10) {
            throw new IllegalArgumentException("Year must not be in the far future");
        }
        this.brand = brand;
        this.year = year;
    }
    
    /**
     * Retrieves the immutable brand identifier of this vehicle.
     * This accessor method is part of the class's encapsulation strategy,
     * providing controlled access to the private field while maintaining
     * immutability guarantees.
     *
     * @return the brand name as a String, guaranteed to be non-null and non-empty
     */
    public String getBrand() {
        return brand;
    }
    
    /**
     * Retrieves the manufacturing year of this vehicle.
     * This accessor method provides read-only access to the year field,
     * maintaining the class's immutability contract while exposing
     * necessary vehicle information.
     *
     * @return the year as an integer, guaranteed to be non-negative
     */
    public int getYear() {
        return year;
    }

    /**
     * <p>
     * Attempts to start the engine using a physical key.
     * </p>
     * <p>
     * This method simulates sending a signal to the engine's ignition system. It returns
     * <code>true</code> if the engine starts successfully (e.g., the key is detected and the engine is ready),
     * or <code>false</code> if the engine fails to start (e.g., invalid key, system failure).
     * </p>
     * <ul>
     *   <li><strong>Override in subclasses:</strong> Subclasses may override this method to provide
     *   type-specific key start logic or to restrict key-based starting for certain vehicle types.</li>
     *   <li><strong>OOP Principle:</strong> This method demonstrates inheritance and polymorphism by allowing
     *   subclasses to customize or extend the base key start behavior.</li>
     * </ul>
     *
     * @return <code>true</code> if the engine started successfully with the key, <code>false</code> otherwise
     */
    public boolean startEngineViaKey() {
        // Simulate sending a signal to the engine
        boolean keyDetected = true; // Replace with actual key detection logic
        boolean engineReady = true; // Replace with actual engine readiness check

        return keyDetected && engineReady;
    }

    /**
     * <p>
     * Attempts to start the engine by pushing a button.
     * </p>
     * <p>
     * Simulates a button press to start the engine. Returns <code>true</code> if the engine starts successfully,
     * or <code>false</code> if the button is not detected or the system fails.
     * </p>
     *
     * @return <code>true</code> if the engine started with the button, <code>false</code> otherwise
     */
    public boolean startEngineViaButton() {
        boolean buttonPressed = true; // Replace with actual button press detection
        boolean engineReady = true; // Replace with actual engine readiness check
        return buttonPressed && engineReady;
    }

    /**
     * <p>
     * Attempts to start the engine remotely (e.g., with a key fob).
     * </p>
     * <p>
     * Simulates remote start logic. Returns <code>true</code> if the remote signal is detected and the engine starts,
     * or <code>false</code> otherwise.
     * </p>
     *
     * @return <code>true</code> if the engine started remotely, <code>false</code> otherwise
     */
    public boolean startEngineRemotelyViaKeyBob() {
        boolean remoteSignalReceived = true; // Replace with actual remote signal detection
        boolean engineReady = true; // Replace with actual engine readiness check
        return remoteSignalReceived && engineReady;
    }

    /**
     * <p>
     * Attempts to start the engine using a smartphone app.
     * </p>
     * <p>
     * Simulates app-based engine start. Returns <code>true</code> if the app command is received and the engine starts,
     * or <code>false</code> otherwise.
     * </p>
     *
     * @return <code>true</code> if the engine started using the app, <code>false</code> otherwise
     */
    public boolean startEngineViaApp() {
        boolean appCommandReceived = true; // Replace with actual app command detection
        boolean engineReady = true; // Replace with actual engine readiness check
        return appCommandReceived && engineReady;
    }

    /**
     * <p>
     * Attempts to start the engine using a manual crank (historical method).
     * </p>
     * <p>
     * Simulates manual cranking. Returns <code>true</code> if the crank is operated correctly and the engine starts,
     * or <code>false</code> otherwise.
     * </p>
     *
     * @return <code>true</code> if the engine started with a manual crank, <code>false</code> otherwise
     */
    public boolean startEngineViaManualCrank() {
        boolean crankOperated = true; // Replace with actual crank operation detection
        boolean engineReady = true; // Replace with actual engine readiness check
        return crankOperated && engineReady;
    }

    /**
     * Provides a string representation of this vehicle following a standardized format.
     * This implementation adheres to toString best practices by including all
     * significant fields in a consistent, readable format.
     *
     * <p>The output format follows the pattern:
     * Vehicle{brand='brandValue', year=yearValue}
     *
     * @return a formatted string representation of the vehicle's state
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + "'" +
                ", year=" + year +
                "}";
    }
}
