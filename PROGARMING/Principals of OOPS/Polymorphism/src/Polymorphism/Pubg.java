package Polymorphism;

// Base class representing a generic Pubg player
public class Pubg {
    int bullets = 30; // Represents the number of bullets available

    // Method to turn the player right
    public void turnRight() {
        System.out.println("Turning right");
    }

    // Method to turn the player left
    public void turnLeft() {
        System.out.println("Turning left");
    }

    // Method to simulate firing a bullet
    public void fire() {
        if (bullets > 0) {
            bullets--; // Decrease bullet count after firing
            System.out.println("Fired");
            System.out.println(bullets + " bullets left");
        } else {
            // If no bullets left, notify the user
            System.out.println("Out of bullets! Reload required.");
        }
    }

    // Method to reload the bullets
    public void reload() {
        bullets = 30; // Reset bullet count
        System.out.println("Reloaded");
    }

    // Move forward by a given number of steps
    public void forward(int steps) {
        System.out.println("Went " + steps + " steps forward");
    }

    // Move backward by a given number of steps
    public void backward(int steps) {
        System.out.println("Went " + steps + " steps backward");
    }
}
