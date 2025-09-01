package Polymorphism;

// Subclass that extends the Pubg class and overrides some behavior
public class PubgV2 extends Pubg {

    // Overridden method: customized turning left action
    @Override
    public void turnLeft() {
        System.out.println("Turning left in PubgV2");
    }

    // Overridden method: customized backward movement
    @Override
    public void backward(int steps) {
        System.out.println("Went " + steps + " steps backward");
    }
}
