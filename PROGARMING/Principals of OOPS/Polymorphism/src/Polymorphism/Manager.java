package Polymorphism;

public class Manager extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Bonus: 20% of base salary");
    }
}