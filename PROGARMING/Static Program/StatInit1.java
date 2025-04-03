class StatInit1 {
    // Static variable to store the value of pi
    static double pi = 22.0 / 7.0; // Approximate value of π

    public static void main(String[] Args) {
        // Calculate and print the area of a circle with radius 100
        areaOfCircle(100);
        
        // Calculate and print the circumference of a circle with radius 100
        circumferenceOfCircle(100);
    }

    // Method to calculate and display the area of a circle
    public static void areaOfCircle(int rad) {
        double area = pi * (rad * rad); // π * r² formula
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate and display the circumference of a circle
    public static void circumferenceOfCircle(int rad) {
        double circ = 2 * pi * rad; // 2πr formula
        System.out.println("Circumference of Circle: " + circ);
    }
}
