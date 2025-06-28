# Circle Area Calculator

## Overview
This is a Java application that calculates the area of a circle based on user input. The program demonstrates object-oriented programming concepts including encapsulation, getter/setter methods, and proper code organization.

## Requirements
- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

## Project Structure
- `Circle.java` - Contains the Circle class with radius property and area calculation method
- `MainApplication.java` - Contains the main method and handles user interaction

## How to Compile and Run

### Compilation
1. Open a terminal/command prompt
2. Navigate to the directory containing the Java files
3. Compile both files:

```
javac Circle.java
javac MainApplication.java
```

Or compile both at once:

```
javac *.java
```

### Running the Program
After successful compilation, run the program:

```
java MainApplication
```

## Program Usage
1. When prompted, enter the radius of the circle (can be a decimal number)
2. Press Enter
3. The program will display the calculated area in square units

## Example Output
```
Enter the radius of a circle:
10
Area of the circle is: 314.16 square units
```

## Features
###**Circle Class**: Encapsulates circle properties and behaviors
  - Private radius variable for data encapsulation
  - Getter and setter methods for accessing radius
  - calculateArea() method using Math.PI for accurate calculations
  - toString() method for string representation
  
###**MainApplication Class**: Handles program flow
  - User input handling using Scanner
  - Circle object instantiation
  - Area calculation and display