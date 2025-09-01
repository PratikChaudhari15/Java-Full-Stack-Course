package Polymorphism;

public class Developer extends Employee {
    @Override
    public void calculateBonus() {
        System.out.println("Bonus: 15% of base salary");
    }
}