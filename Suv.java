public class Suv extends Car {

    public Suv(String name, int gears, boolean isManual) {
        super(name, 4, 5, 6, isManual, "SUV");  // Calling Car constructor with fixed wheels and doors, and passing gears and isManual
    }

    public void accelerate(int rate) {

      
            // Calculate new speed based on the current speed and rate
            int newSpeed = getCurrentSpeed() + rate;
        
            // Adjust gear based on the new speed
            if (newSpeed == 0) {
                stop();  // If speed is 0, stop the vehicle
                changeGear(1);  // Set gear to 1
            } else if (newSpeed > 0 && newSpeed <= 10) {
                changeGear(1);  
                changeGear(2);  
            } else if (newSpeed > 20 && newSpeed <= 30) {
                changeGear(3);  
            } else if (newSpeed > 30 && newSpeed <= 50) {
                changeGear(4); 
            } else if (newSpeed > 50 && newSpeed <= 70) {
                changeGear(5);  
            } else {
                changeGear(6);
            }
        
            if (newSpeed > 0) {

                changeSpeed(newSpeed, getCurrentDirection());
                
            }
        }

        public static void main(String[] args) {
            

            Suv urus = new Suv("lamborghini urus", 6, false );
            urus.move(13, 10);
            urus.accelerate(100);
            urus.stop();
            urus.steer(20);

            
        }
        
}
