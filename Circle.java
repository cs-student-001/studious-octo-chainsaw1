/**
 * Circle class that represents a circle with a radius
 * and can calculate its area
 */
public class Circle {
    // Private instance variable for radius
    private double radius;
    
    /**
     * Default constructor
     */
    public Circle() {
        this.radius = 0.0;
    }
    
    /**
     * Constructor with radius parameter
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * Getter method for radius
     * @return the radius of the circle
     */
    public double getRadius() {
        return this.radius;
    }
    
    /**
     * Setter method for radius
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates the area of the circle
     * @return the area of the circle (π * r²)
     */
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    /**
     * Returns a string representation of the circle
     * @return string describing the circle
     */
    public String toString() {
        return "Area of the circle is: " + String.format("%.2f", this.calculateArea()) + " square units";
    }
}