package Exception;

public class PropagationExample
{
    public static void method3() {
        // Arithmetic exception occurs here
        int result = 10 / 0;
    }

    public static void method2() {
        method3();  // Calls method3
    }

    public static void method1() {
        method2();  // Calls method2
    }

    public static void main(String[] args) {
        try {
            method1();  // Start the call chain
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main(): " + e);
        }

        System.out.println("Program continues after handling exception...");
    }
}