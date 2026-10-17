// Child class inherits from Account
public class FixedDeposit extends Account {

    // Implements the interest method
    public double interest() {
        return 0.0;
    }

    // Implements the close method
    public void close() {
        System.out.println("Account closed");
    }
}

//  QUESTION D
//Example: An abstract class called Vehicle.
// Abstract parent class
abstract class Vehicle {

    // Abstract method to start the vehicle
    public abstract void start();

    // Abstract method to stop the vehicle
    public abstract void stop();
}

// QUESTION E
// Car inherits from Vehicle
class Car extends Vehicle {

    // Implements the start method
    public void start() {
        System.out.println("Car has started");
    }

    // Implements the stop method
    public void stop() {
        System.out.println("Car has stopped");
    }
}