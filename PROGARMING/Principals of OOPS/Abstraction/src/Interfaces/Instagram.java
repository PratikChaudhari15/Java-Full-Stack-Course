package Interfaces;

/**
 * Interface Instagram - defines core actions expected from an Instagram-like app.
 * Interfaces are used to define a contract — a set of methods that implementing classes must define.
 */
public interface Instagram {
    void post(String ip);
    void like(String name);
    void comment(String name, String ip);
    void message(String name, String msg);
    void story(String msg);

    // Static method in interface: belongs to interface, can be called without object
    static void message(String name) {
        System.out.println("Hey! " + name + ", Welcome to Instagram!");
    }
}
