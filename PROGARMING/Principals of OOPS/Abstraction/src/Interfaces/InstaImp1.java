package Interfaces;

/**
 * InstaImp1 is an abstract class that partially implements the Instagram interface.
 * It implements some methods, while leaving others for further implementation.
 */
public abstract class InstaImp1 implements Instagram {
    String user;
    String password;

    // Default constructor
    public InstaImp1() {
    }

    // Parameterized constructor
    public InstaImp1(String user, String password) {
        this.user = user;
        this.password = password;
        System.out.println("Account Created for user: " + user);
    }

    // Concrete implementation of post()
    public void post(String ip) {
        System.out.println(user + " posted: " + ip);
    }

    // Concrete implementation of like()
    public void like(String name) {
        System.out.println(name + " liked the post.");
    }

    // Concrete implementation of comment()
    public void comment(String name, String ip) {
        System.out.println(name + " commented: " + ip);
    }

    // Concrete implementation of message()
    public void message(String name, String msg) {
        System.out.println("Message to " + name + ": " + msg);
    }
}
