// Employee is an abstract class that implements Payable
public abstract class Employee implements Payable {

    // Private fields
    private String staffId;
    private String name;

    // Constructor to store employee details
    public Employee(String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    // Returns the employee's name
    public String getName() {
        return name;
    }

    // Abstract method to calculate employee pay
    public abstract double calculatePay();

    // Returns the calculated payment
    public double getPaymentAmount() {
        return calculatePay();
    }

    // Returns the employee's ID and name
    public String toString() {
        return staffId + " " + name;
    }
}
