public class Car extends Vehicle {
    
    private int wheels = 0;
    private String type = null;
    private int doors = 0;
    private int gears = 0;
    private boolean isManual;
    private int currentGear = 0;

    // Constructor for Car class, now it properly calls the Vehicle constructor
    
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        super(name, 0, 0);  // Call Vehicle constructor with default values for currentSpeed and currentDirection
        this.wheels = wheels;
        this.type = "Car";  // Fixed type for all cars
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;  // Default gear
        this.type = type;
    }
    
    // Method to change the gear
    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Gear is changed to " + this.currentGear);
    }

    // Method to change speed and direction using move() from Vehicle
    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);  // Call move() method from Vehicle
        System.out.println("Change speed method is called, speed changed to: " + newSpeed + " and the new direction is: " + newDirection);
    }

    // Additional Getters and Setters if needed
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean isManual) {
        this.isManual = isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
