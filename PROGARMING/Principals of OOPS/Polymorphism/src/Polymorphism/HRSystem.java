package Polymorphism;

public class HRSystem
{
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        e1.calculateBonus();
        e2.calculateBonus();
    }
}
