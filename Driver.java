public class Driver extends Car {

    public void drive() {
        System.out.println("You decided to drive the car");
        gas--;
        status();
    }

    public void boost() {
        System.out.println("Activate boosters!");
        gas = gas - 3;
        status();
    }

    public void refuel() {
        System.out.println("adding fuel");
        gas = gas + 2;
        status();
    }
    
}
