package Polymorphism;

public class FatherSonDriver {
    public static void main(String[] args) {
        // Upcasting: Father reference pointing to a Son object
        Father f1 = new Son();

        // Due to method overriding, Son's versions are called at runtime
        f1.finance();  // Output: Middle Class (from Son)
        f1.name();     // Output: Good Boy (from Son)
    }
}
