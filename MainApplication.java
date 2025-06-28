import java.util.Scanner;

/**
 * Main application class for the Circle Area Calculator
 * This class handles user input and calculates the area of a circle
 */
public class MainApplication {
    
    /**
     * Main method - entry point of the program
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.println("Enter the radius of a circle:");
        
        // Read the radius value from user
        double radius = input.nextDouble();
        if (radius <= 0) {
        	System.out.println("Enter a value greater than zero:");
        	radius = input.nextDouble();
        }
        
        // Create a Circle object
        Circle myCircle = new Circle();
        
        // Set the radius using the setter method
        myCircle.setRadius(radius);
        
        // Calculate the area of the circle
        double area = myCircle.calculateArea();
        
        // Display the calculated area
        System.out.println(myCircle.toString());
        
        // Close the scanner
        input.close();
    }
}