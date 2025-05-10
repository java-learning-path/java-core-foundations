package org.javalearning.core.oop.inheritance.basic;

/* 
 * Parent Class (Vehicle)
 * 
 * Analyze:
 *      
 *      Identify shared attributes across all vehicles (e.g., brand, year).
 *      Ensure attributes are generic enough for subclasses — avoid overly specific fields like engineType unless universal.
 * 
 * Do Not Forget: 
 * 
 *      Initialize all fields in Constructor.
 *      Provide getters or read-only access (getBrand(), getYear()).
 *      Follow this exact toString pattern:
 *          "Vehicle{brand='" + brand + "', year=" + year + "}"  
 * 
 *  Improve:
 * 
 *      Declare fields final to prevent modification after construction — Immutability.
 *      Add input checks in the constructor (e.g., reject null/empty brand or negative year).
 */

class Vehicle {
    private final String brand;
    private final int year;

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
    
    public String getBrand() {
        return brand;
    }
    
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}