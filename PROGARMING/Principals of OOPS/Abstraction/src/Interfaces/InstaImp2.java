package Interfaces;

/**
 * InstaImp2 extends InstaImp1 and completes the implementation of Instagram interface.
 */
public class InstaImp2 extends InstaImp1 {

    // Default constructor
    public InstaImp2() {
    }

    // Parameterized constructor to call superclass constructor
    public InstaImp2(String user, String password) {
        super(user, password);
    }

    // Concrete implementation of story()
    public void story(String msg) {
        System.out.println(user + " posted a story: " + msg);
    }
}
