# Java Core Foundations

<div align="center">
  <img src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png" alt="Java Logo" width="120">
  <h3>Practical Java Core Concepts & Implementation</h3>
</div>

## 📋 Overview

This repository contains practical code examples, exercises, and implementations that demonstrate core Java programming concepts. It's designed as a hands-on learning resource focused on fundamental Java topics including object-oriented programming, collections, exceptions, memory management, and concurrency.

Each module is structured to provide a combination of:
- Complete working examples with comprehensive comments
- Step-by-step implementation guides
- Practical exercises with solutions
- Best practice demonstrations

## 🏗️ Repository Structure

This is a multi-module Maven project organized by core Java concept domains:

```
java-core-foundations/
├── pom.xml                  # Parent POM file
├── oop/                     # Object-Oriented Programming
│   ├── examples/            # Complete working examples
│   │   ├── inheritance/     # Inheritance examples (Vehicle hierarchy)
│   │   ├── polymorphism/    # Polymorphism examples
│   │   ├── encapsulation/   # Encapsulation examples
│   │   └── abstraction/     # Abstraction examples
│   ├── exercises/           # Practice exercises with solutions
│   └── docs/                # Documentation and explanations
├── collections/             # Java Collections Framework
│   ├── examples/
│   ├── exercises/
│   └── docs/
├── exceptions/              # Exception handling
│   ├── examples/
│   ├── exercises/
│   └── docs/
├── memory/                  # Memory management
│   ├── examples/
│   ├── exercises/
│   └── docs/
└── concurrency/             # Concurrency and parallelism
    ├── examples/
    ├── exercises/
    └── docs/
```

## 🚀 Available Examples

Here are some of the key examples currently available:

### Object-Oriented Programming
- [Vehicle Inheritance Hierarchy](oop/examples/inheritance/) - Demonstrates inheritance, polymorphism, and field validation
- *Polymorphism with Shapes* (Coming soon)
- *Interface vs Abstract Class* (Coming soon)
- *SOLID Principles* (Coming soon)

### Collections (Coming soon)
- *ArrayList vs LinkedList Performance*
- *HashMap Implementation Deep Dive*
- *Custom Sorting with Comparator*

### Exceptions (Coming soon)
- *Exception Handling Best Practices*
- *Custom Exception Hierarchies*
- *Try-with-Resources Patterns*

## 🛠️ Technical Requirements

- Java 17 or higher
- Maven 3.8.0 or higher
- Git

## ⚙️ Setup Instructions

### Clone the Repository

```bash
git clone https://github.com/java-learning-path/java-core-foundations.git
cd java-core-foundations
```

### Build the Project

```bash
mvn clean install
```

### IDE Setup

This project works with any major Java IDE:

#### IntelliJ IDEA
1. Choose "Open" or "Import Project"
2. Select the `java-core-foundations` directory
3. Choose "Import project from external model" and select "Maven"
4. Follow the wizard steps to complete the import

#### Eclipse
1. Select "File" > "Import..."
2. Choose "Maven" > "Existing Maven Projects"
3. Browse to the `java-core-foundations` directory
4. Select the pom.xml file and click "Finish"

#### VS Code
1. Open VS Code
2. Select "File" > "Open Folder..."
3. Choose the `java-core-foundations` directory
4. Install the Java Extension Pack if you haven't already

## 🏃‍♂️ Running Examples

Each example can be run independently. For example, to run the Vehicle inheritance example:

```bash
# Navigate to the project root
cd java-core-foundations

# Run using Maven
mvn exec:java -pl oop/examples/inheritance -Dexec.mainClass="org.javalearning.core.oop.inheritance.basic.Main"

# Alternatively, you can run the class directly if you've built the project
java -cp oop/examples/inheritance/target/oop-inheritance-example-1.0.0.jar org.javalearning.core.oop.inheritance.basic.Main
```

## 🧪 Testing

Each module includes unit tests to validate the implementation. Run the tests with:

```bash
# Run all tests
mvn test

# Run tests for a specific module
mvn test -pl oop/examples/inheritance
```

## 📚 Learning Path

For a structured learning experience, we recommend following this order:

1. Start with the OOP examples, beginning with the Vehicle Inheritance example
2. Move on to the Collections examples to understand data structures
3. Explore Exception handling patterns
4. Study Memory management concepts
5. Finish with Concurrency for advanced topics

## 🤝 Contributing

We welcome contributions to this repository! Please see our [Contribution Guidelines](https://github.com/java-learning-path/java-learning-hub#contribution-guidelines) for details.

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<div align="center">
  <p><a href="https://github.com/java-learning-path/java-learning-hub">Back to Java Learning Path Hub</a></p>
</div>

