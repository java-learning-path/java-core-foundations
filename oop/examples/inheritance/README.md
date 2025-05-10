# Vehicle Inheritance Example

This example demonstrates key Object-Oriented Programming (OOP) principles through a simple vehicle class hierarchy. It showcases inheritance relationships between a base `Vehicle` class and its subclasses (`Car` and `Motorcycle`), along with proper implementation of encapsulation, validation, and polymorphism.

## 📚 Class Hierarchy

```
        ┌─────────┐
        │ Vehicle │
        └────┬────┘
             │
      ┌──────┴──────┐
      │             │
┌─────▼────┐  ┌─────▼──────┐
│   Car    │  │ Motorcycle │
└──────────┘  └────────────┘
```

- **Vehicle**: Base class with common properties (`brand`, `year`) and methods.
- **Car**: Subclass that extends Vehicle and adds `numDoors` property.
- **Motorcycle**: Subclass that extends Vehicle and adds `hasSideCar` property.

## 🔑 Key OOP Principles Demonstrated

### 1. Inheritance

Inheritance allows classes to inherit properties and behaviors from a parent class. Both `Car` and `Motorcycle` inherit from `Vehicle`.

```java
// Base class
public class Vehicle {
    private final String brand;
    private final int year;
    
    // Methods and constructors...
}

// Child class inheriting from Vehicle
public class Car extends Vehicle {
    private final int numDoors;
    
    // Additional methods and constructor...
}
```

### 2. Polymorphism

Polymorphism allows methods to do different things based on the object it is acting upon.

```java
// Different implementations of toString() in each class
@Override
public String toString() {
    return "Vehicle{" +
            "brand='" + brand + '\'' +
            ", year=" + year +
            '}';
}

// Car's implementation
@Override
public String toString() {
    return "Car{" +
            "brand='" + getBrand() + '\'' +
            ", year=" + getYear() + 
            ", numDoors=" + numDoors +
            "}";
}
```

The example also demonstrates runtime polymorphism through an array of `Vehicle` objects:

```java
// Creating an array of Vehicle objects
Vehicle[] vehicles = {vehicle, car, motorcycle};

// Each object behaves according to its actual type
for (Vehicle v : vehicles) {
    System.out.println("Vehicle info: " + v);
    
    // Using instanceof for type checking
    if (v instanceof Car) {
        Car c = (Car) v;
        System.out.println("  This is a car with " + c.getNumDoors() + " doors");
    } else if (v instanceof Motorcycle) {
        // ...
    }
}
```

### 3. Encapsulation

Encapsulation hides internal state and requires all interaction to be performed through well-defined interfaces.

```java
// Private fields with public getter methods
private final String brand;
private final int year;

public String getBrand() {
    return brand;
}

public int getYear() {
    return year;
}
```

### 4. Field Immutability

Using `final` fields ensures that once an object is constructed, its state cannot be changed.

```java
private final String brand;
private final int year;
private final int numDoors;
```

### 5. Input Validation

The example demonstrates proper input validation in constructors:

```java
public Vehicle(String brand, int year) {
    // Validate brand (non-null, non-empty)
    if (brand == null || brand.trim().isEmpty()) {
        throw new IllegalArgumentException("Brand cannot be null or empty");
    }
    
    // Validate year (non-negative)
    if (year < 0) {
        throw new IllegalArgumentException("Year cannot be negative");
    }
    
    this.brand = brand;
    this.year = year;
}
```

## 🔄 Running the Example

You can run the example using Maven:

```bash
mvn clean compile exec:java
```

This will output:
- Basic object creation and toString() behavior
- Validation examples with IllegalArgumentExceptions
- Usage of getter methods
- Polymorphism demonstration

## 📋 Learning Outcomes

After studying this example, you should understand:

1. **Inheritance Mechanics**: How to extend a class and inherit its properties and methods
2. **Constructor Chaining**: How subclass constructors call parent constructors using `super()`
3. **Method Overriding**: How to provide specialized behavior in subclasses
4. **Polymorphic Behavior**: How parent type references can access child objects
5. **Runtime Type Checking**: Using `instanceof` to determine actual object types
6. **Encapsulation Principles**: Using private fields with getter methods
7. **Immutability Benefits**: Using final fields for thread safety and API design
8. **Defensive Programming**: Validating input in constructors

## 🔍 Additional Notes

### When to Use Inheritance

Inheritance is appropriate when there is a clear "is-a" relationship:
- A Car **is a** Vehicle
- A Motorcycle **is a** Vehicle

### Alternatives to Consider

For different scenarios, consider:
- **Composition**: When there's a "has-a" relationship instead of "is-a"
- **Interfaces**: For defining contracts that multiple unrelated classes can implement

## 🛠️ Future Enhancements

- Add more vehicle types (Truck, Bicycle)
- Implement behavior methods like `accelerate()` or `brake()`
- Add interfaces like `Convertible` or `Towable`
- Demonstrate method overloading along with overriding

---

For more information on Java OOP principles, visit the [Java Core Foundations](https://github.com/java-learning-path/java-core-foundations) repository.

