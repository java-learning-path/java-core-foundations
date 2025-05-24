package org.javalearning.core.oop.inheritance.instantiation;

import org.javalearning.core.oop.inheritance.domain.Car;
import org.javalearning.core.oop.inheritance.domain.Motorcycle;
import org.javalearning.core.oop.inheritance.domain.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <p>
 * Unit tests for input validation and instantiation scenarios in the Vehicle inheritance hierarchy.
 * </p>
 * <p>
 * This class covers:
 * <ul>
 *   <li>Validation of constructor arguments (brand, year, number of doors) for Vehicle and Car</li>
 *   <li>Exception handling for invalid input (IllegalArgumentException, ClassCastException)</li>
 *   <li>Successful instantiation and attribute access for Vehicle, Car, and Motorcycle</li>
 *   <li>Verification of toString() method overriding</li>
 * </ul>
 * </p>
 * <p>
 * These tests ensure that the domain model enforces correct input validation, throws appropriate exceptions, 
 * and supports correct instantiation and attribute access across the inheritance hierarchy.
 * </p>
 *
 * @author Logic Luminary
 * @version 1.2
 * @since 1.2
 */
public class VehicleInputValidationAndInstantiationScenariosTest {
    /**
     * <p>
     * Tests that creating a {@code Vehicle} with an empty or blank brand throws an {@code IllegalArgumentException}.
     * </p>
     * <p>
     * The exception message should indicate the brand is invalid.
     * </p>
     */
    @Test
    public void shouldThrowAnExceptionWhenCreatingVehicleWithEmptyOrBlankBrand() {
        // Arrange
        String[] invalidBrands = {"", "   "};
        int year = 2022;

        // Act & Assert
        for (String brand : invalidBrands) {
            IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new Vehicle(brand, year),
                "Vehicle constructor should throw IllegalArgumentException when brand is empty or blank: '" + brand + "'"
            );
            assertTrue(thrown.getMessage().toLowerCase().contains("brand"),
                "Validation exception message should indicate the brand is invalid. Actual message: " + thrown.getMessage());
        }
    }

    /**
     * <p>
     * Tests that creating a {@code Vehicle} with a {@code null} brand throws an {@code IllegalArgumentException}.
     * </p>
     * <p>
     * The exception message should indicate the brand must not be {@code null}.
     * </p>
     */
    @Test
    public void shouldThrowAnExceptionWhenCreatingVehicleWithNullBrand() {
        // Arrange
        String nullBrand = null;
        int testYear = 2023;

        // Act & Assert
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> new Vehicle(nullBrand, testYear),
            "Vehicle constructor should throw IllegalArgumentException when brand is null: " + nullBrand
        );
        assertTrue(thrown.getMessage().toLowerCase().contains("brand"),
            "Validation exception message should indicate the brand is invalid. Actual message: " + thrown.getMessage());
    }

    /**
     * <p>
     * Tests that creating a {@code Vehicle} with a year before the earliest valid year (1886) throws an {@code IllegalArgumentException}.
     * </p>
     * <p>
     * The exception message should indicate the year must be greater than or equal to 1886.
     * </p>
     */
    @Test
    public void shouldThrowAnExceptionWhenCreatingVehicleWithYearBeforeEarliestValid() {
        // Arrange
        String brand = "Generic";
        int[] invalidYears = {-2022, 0, 1500, 1885};

        // Act & Assert
        for (int year : invalidYears) {
            IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new Vehicle(brand, year),
                "Vehicle constructor should throw IllegalArgumentException when year is less than 1886: " + year
            );
            assertTrue(thrown.getMessage().contains("1886"),
                "Validation exception message should indicate the year must be >= 1886. Actual message: " + thrown.getMessage());
        }
    }

    /**
     * <p>
     * Tests that creating a {@code Car} with a negative number of doors throws an {@code IllegalArgumentException}.
     * </p>
     * <p>
     * The exception message should indicate the number of doors must be positive.
     * </p>
     */
    @Test
    public void shouldThrowAnExceptionWhenCreatingCarWithNegativeNumDoors() {
        // Arrange
        String brand = "BMW";
        int year = 2021;
        int numDoors = -4;

        // Act & Assert
        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> new Car(brand, year, numDoors),
            "Car constructor should throw IllegalArgumentException when numDoors is negative: " + numDoors
        );
        assertTrue(thrown.getMessage().toLowerCase().contains("door"),
            "Validation exception message should indicate the number of doors is invalid. Actual message: " + thrown.getMessage());
    }

    /**
     * <p>
     * Tests that creating a {@code Vehicle} with a year more than 10 years in the future throws an {@code IllegalArgumentException}.
     * </p>
     * <p>
     * The exception message should indicate the year must not be in the far future.
     * </p>
     */
    @Test
    public void shouldThrowAnExceptionWhenCreatingVehicleWithYearTooFarInFuture() {
        // Arrange
        String brand = "Generic";
        int currentYear = java.time.Year.now().getValue();
        int[] invalidFutureYears = {currentYear + 11, currentYear + 50, currentYear + 100};

        // Act & Assert
        for (int year : invalidFutureYears) {
            IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new Vehicle(brand, year),
                "Vehicle constructor should throw IllegalArgumentException when year is more than 10 years in the future: " + year
            );
            assertTrue(thrown.getMessage().toLowerCase().contains("future"),
                "Validation exception message should indicate the year must not be in the far future. Actual message: " + thrown.getMessage());
        }
    }

    /**
     * <p>
     * Tests that creating a {@code Car} with an invalid number of doors (less than 1 or greater than 6)
     * throws an {@code IllegalArgumentException}.
     * </p>
     * <p>
     * The exception message should indicate the valid range for the number of doors.
     * </p>
     */
    @Test
    public void shouldThrowAnExceptionWhenCreatingCarWithInvalidNumDoors() {
        // Arrange
        String brand = "BMW";
        int year = 2021;
        int[] invalidNumDoors = {0, -1, 7, 100};

        // Act & Assert
        for (int numDoors : invalidNumDoors) {
            IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> new Car(brand, year, numDoors),
                "Car constructor should throw IllegalArgumentException when numDoors is out of valid range: " + numDoors
            );
            assertTrue(thrown.getMessage().contains("between 1 and 6"),
                "Validation exception message should indicate the valid range for number of doors. Actual message: " + thrown.getMessage());
        }
    }

    /**
     * <p>
     * Tests that attempting to cast a {@code Vehicle} to an unrelated subclass (e.g., {@code Car} or {@code Motorcycle})
     * when the actual object is not of that type throws a {@code ClassCastException}.
     * </p>
     * <p>
     * This verifies that Java's runtime type checking prevents invalid downcasts in the inheritance hierarchy.
     * </p>
     */
    @Test
    public void shouldThrowClassCastExceptionOnInvalidDowncastCorrectly() {
        // Arrange
        Vehicle vehicle = new Vehicle("Generic", 2022);
        Vehicle car = new Car("BMW", 2021, 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", 2020, false);

        // Act & Assert
        // Vehicle is not a Car
        assertThrows(ClassCastException.class, () -> {
            ( (Car) vehicle ).toString();
        }, "Casting Vehicle (not a Car) to Car should throw ClassCastException");

        // Vehicle is not a Motorcycle
        assertThrows(ClassCastException.class, () -> {
            ( (Motorcycle) vehicle ).toString();
        }, "Casting Vehicle (not a Motorcycle) to Motorcycle should throw ClassCastException");

        // Car is not a Motorcycle
        assertThrows(ClassCastException.class, () -> {
            ( (Motorcycle) car ).toString();
        }, "Casting Car to Motorcycle should throw ClassCastException");

        // Motorcycle is not a Car
        assertThrows(ClassCastException.class, () -> {
            ( (Car) motorcycle ).toString();
        }, "Casting Motorcycle to Car should throw ClassCastException");
    }

    /**
     * <p>
     * Tests that a Vehicle object can be instantiated successfully and its attributes accessed correctly.
     * </p>
     */
    @Test
    public void shouldInstantiateVehicleAndReadAttributesCorrectly() {
        // Arrange
        Vehicle vehicle = new Vehicle("Generic", 2022);

        // Act && Assert
        assertNotNull(vehicle);
        assertEquals("Generic", vehicle.getBrand());
        assertEquals(2022, vehicle.getYear());
    }

    /**
     * <p>
     * Tests that a Car object can be instantiated successfully and its attributes accessed correctly.
     * </p>
     */
    @Test
    public void shouldInstantiateCarAndReadAttributesCorrectly() {
        // Arrange
        Car car = new Car("BMW", 2021, 4);

        // Act && Assert
        assertNotNull(car);
        assertEquals("BMW", car.getBrand());
        assertEquals(2021, car.getYear());
        assertEquals(4, car.getNumDoors());
    }

    /**
     * <p>
     * Tests that a Motorcycle object can be instantiated successfully and its attributes accessed correctly.
     * </p>
     */
    @Test
    public void shouldInstantiateMotorcycleAndReadAttributesCorrectly() {
        // Arrange
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2020, false);

        // Act && Assert
        assertNotNull(motorcycle);
        assertEquals("Harley-Davidson", motorcycle.getBrand());
        assertEquals(2020, motorcycle.getYear());
        assertFalse(motorcycle.getHasSideCar());
    }

    /**
     * <p>
     * Tests that the {@code toString()} method of each class returns the expected string.
     * </p>
     * <p>
     * Asserts the output for Vehicle, Car, and Motorcycle.
     * </p>
     */
    @Test
    public void shouldDemonstrateInheritanceAndToStringMethodOverridingCorrectly() {
        // Arrange
        Vehicle vehicle = new Vehicle("Generic", 2022);
        Car car = new Car("BMW", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2020, false);

        // Act && Assert
        assertEquals("Vehicle{brand='Generic', year=2022}", vehicle.toString());
        assertEquals("Car{brand='BMW', year=2021, numDoors=4}", car.toString());
        assertEquals("Motorcycle{brand='Harley-Davidson', year=2020, hasSideCar=false}", motorcycle.toString());
    }
}
