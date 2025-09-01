package wrapper;  // Declares the package

public class Camera {
    String brand;          // Brand name of the camera
    double price;          // Price of the camera
    int mp;                // Megapixels
    int ports;             // Number of ports
    boolean nightvision;   // Night vision feature

    // Default constructor
    public Camera() {
        // Does nothing, just allows empty Camera object creation
    }

    // Parameterized constructor to set all fields
    public Camera(String brand, double price, int mp, int ports, boolean nightvision) {
        this.brand = brand;               // 'this' refers to the current object's fields
        this.price = price;
        this.mp = mp;
        this.ports = ports;
        this.nightvision = nightvision;
    }

    // Properly overridden toString() method with uppercase 'S'
    @Override
    public String toString() {
        // Return a formatted string with all camera details
        return "[brand: " + brand +
                " price: " + price +
                " mp: " + mp +
                " ports: " + ports +
                " nightvision: " + nightvision + "]";
    }

    // Properly overridden equals() method with capital 'O' in Object.
    @Override
    public boolean equals(Object o) {
        // Check if the given object is not null and is a Camera instance
        if (o != null && o instanceof Camera) {
            Camera c = (Camera) o;  // Cast the object to Camera
            // Compare all fields; use .equals() for String comparison
            return this.brand.equals(c.brand) &&
                    this.price == c.price &&
                    this.mp == c.mp &&
                    this.ports == c.ports &&
                    this.nightvision == c.nightvision;
        }
        return false;  // Not equal if null or not a Camera
    }

    // Properly overridden hashCode() to match equals()
    @Override
    public int hashCode() {
        // Combine the hash codes of all relevant fields
        return brand.hashCode() +
                Double.hashCode(price) +
                mp +
                ports +
                Boolean.hashCode(nightvision);
    }
}
