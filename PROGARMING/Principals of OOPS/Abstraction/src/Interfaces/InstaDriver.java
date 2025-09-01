package Interfaces;

/**
 * Main class to test the implementation.
 */
public class InstaDriver {
    public static void main(String[] args) {

        // Creating object of concrete class (InstaImp2)
        Instagram i1 = new InstaImp2("Raju", "raju@123");

        // Calling interface methods via reference
        i1.post("Feeling happy today!");
        i1.like("Angel Priya");
        i1.comment("Angel Priya", "How are you?");
        i1.message("Angel Priya", "How do you do?");
        i1.story("Beautiful sunset 🌇");

        // Calling static method directly from interface
        Instagram.message("Raju");
    }
}
