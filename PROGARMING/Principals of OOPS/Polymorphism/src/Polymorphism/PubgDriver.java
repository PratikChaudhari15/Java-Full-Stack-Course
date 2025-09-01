package Polymorphism;

public class PubgDriver {
    public static void main(String[] args) {

        // Polymorphism: Pubg reference refers to PubgV2 object
        Pubg p1 = new PubgV2();

        // Calls overridden method in PubgV2
        p1.backward(10);

        // Calls overridden method in PubgV2
        p1.turnLeft();

        // You can also call methods from the base class, like fire, reload, etc.
        p1.fire();    // Fires one bullet
        p1.reload();  // Reloads bullets
    }
}
