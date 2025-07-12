package Has_a_realtionship;

public class Aeroplane {
    String brand;
    double price;
    String type;
    Engine1 rf;

    public Aeroplane() {
        // default constructor
    }

    public Aeroplane(String brand, double price, String type, String color, double size, String fueltype) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.rf = new Engine1(color, size, fueltype);
        System.out.println("Aeroplane created");
    }

    public void displayAeroplane() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }
}
