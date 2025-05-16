package org.javalearning.core.oop.inheritance.basic;

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
 * @version 1.0
 * @since 1.0
 */
class Vehicle {
    private final String brand;
    private final int year;

    /**
     * Constructs a new Vehicle instance with input validation and immutable state initialization.
     * This constructor implements defensive programming principles through comprehensive
     * parameter validation and establishes the object's immutable state.
     *
     * <p>The validation process ensures:
     * <ul>
     *   <li>Brand parameter meets non-null and non-empty requirements</li>
     *   <li>Year value falls within logical constraints</li>
     *   <li>Object state consistency through final field initialization</li>
     * </ul>
     *
     * @param brand the manufacturer brand of the vehicle
     * @param year the manufacturing year of the vehicle
     * @throws IllegalArgumentException if brand is null or empty, or if year is negative
     */
    public Vehicle(String brand, int year) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative");
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
