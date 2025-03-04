public class Vehicle {

    private String name = null;
    private int currentSpeed = 0;
    private int currentDirection = 0;

    // Default constructor (no semicolon)
    public Vehicle() {}

    // Constructor with parameters
    public Vehicle(String name, int currentSpeed, int currentDirection) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }

    // Setters and Getters
    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method for steering the vehicle
    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Steer method called: Steering at " + currentDirection + " degrees");
    }

    // Method for moving the vehicle
    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Move method called: Moving at " + currentSpeed + " km/h in direction " + currentDirection + " degrees");
    }

    // Method to stop the vehicle
    public void stop() {
        this.currentSpeed = 0;
        this.currentDirection = 0;  // Optionally reset direction as well
        System.out.println("Vehicle stopped.");
    }
}
