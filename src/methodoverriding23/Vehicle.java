package methodoverriding23;

public class Vehicle {
    // defining a method
    public void run(){
        System.out.println("Vehicle is running");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // creating object
        obj.run();// calling method
    }
}


