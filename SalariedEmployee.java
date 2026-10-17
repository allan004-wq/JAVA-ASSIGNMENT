// QUESTION C
// SalariedEmployee inherits from Employee
public class SalariedEmployee extends Employee {

    // Stores the monthly salary
    private double monthlySalary;

    // Constructor
    public SalariedEmployee(String staffId, String name, double salary) {
        super(staffId, name);

        // Check if salary is negative
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        // Store the salary
        monthlySalary = salary;
    }

    // Returns the monthly salary
    public double calculatePay() {
        return monthlySalary;
    }
}