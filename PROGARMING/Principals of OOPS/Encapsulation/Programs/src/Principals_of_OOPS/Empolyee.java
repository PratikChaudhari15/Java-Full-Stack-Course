package Principals_of_OOPS;

// Class to represent an Employee
public class Empolyee {
    
    // Instance variables (private for encapsulation)
    private String name;
    private String company;
    private String position;
    private double salary;

    // Constructor to initialize employee details
    public Empolyee(String name, String company, String position, double salary) {
        this.name = name;
        this.company = company;
        this.position = position;
        this.salary = salary;
    }

    // Getter method for employee name
    public String getname() {
        return name;
    }

    // Getter method for company name
    public String getcompany() {
        return company;
    }

    // Getter method for position
    public String getposition() {
        return position;
    }

    // Method to promote the employee
    public void promote(String newPosition, double increment) {
        position = newPosition;
        salary += increment;

        // Print promotion details (Minor correction: fix typos)
        System.out.println(name + " is promoted to position " + position + " with new salary: " + salary);

    }

    // Method to display all employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
