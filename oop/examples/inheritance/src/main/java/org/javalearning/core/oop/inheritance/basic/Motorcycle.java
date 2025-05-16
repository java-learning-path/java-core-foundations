package org.javalearning.core.oop.inheritance.basic;

/**
 * Represents a specialized vehicle type implementing motorcycle-specific attributes and behaviors.
 * This class extends the base Vehicle class, demonstrating inheritance principles with
 * boolean state management. It maintains the immutability contract established
 * by its parent class while adding motorcycle-specific features.
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
 * Adds motorcycle-specific attributes:
 * <ul>
 *   <li>Sidecar presence as a boolean state</li>
 *   <li>Simplified state management for optional features</li>
 *   <li>Proper encapsulation of new attributes</li>
 * </ul>
 * 
 * <p><strong>Design Considerations:</strong>
 * The boolean state pattern demonstrates:
 * <ul>
 *   <li>Simple feature toggling</li>
 *   <li>Immutable boolean fields</li>
 *   <li>Getter naming conventions for boolean properties</li>
 * </ul>
 *
 * @author Logic Luminary
 * @version 1.0
 * @since 1.0
 */
public class Motorcycle extends Vehicle {
    private final boolean hasSideCar;

    /**
     * Constructs a new Motorcycle instance with complete parameter validation and immutable state initialization.
     * This constructor extends the vehicle initialization process with motorcycle-specific
     * state management.
     *
     * <p>The construction process ensures:
     * <ul>
     *   <li>Base vehicle properties are properly initialized through super()</li>
     *   <li>Sidecar state is captured</li>
     *   <li>Immutability is maintained for all fields</li>
     * </ul>
     *
     * @param brand the manufacturer brand of the motorcycle
     * @param year the manufacturing year of the motorcycle
     * @param hasSideCar indicates whether the motorcycle has a sidecar attached
     * @throws IllegalArgumentException if brand/year validation fails in super constructor
     */
    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }
    
    /**
     * Determines whether this motorcycle has a sidecar attachment.
     * This accessor method maintains the class's immutability contract while
     * providing access to motorcycle-specific attributes.
     *
     * @return true if the motorcycle has a sidecar, false otherwise
     */
    public boolean getHasSideCar() {
        return hasSideCar;
    }

    /**
     * Provides a string representation of this motorcycle, extending the base vehicle
     * representation with motorcycle-specific attributes.
     *
     * <p>The output format follows the pattern:
     * Motorcycle{brand='brandValue', year=yearValue, hasSideCar=sidecarValue}
     *
     * @return a formatted string representation of the motorcycle's complete state
     */
    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + getBrand() + "'" +
                ", year=" + getYear() +
                ", hasSideCar=" + hasSideCar +
                "}";
    }
}
