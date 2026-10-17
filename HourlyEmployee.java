// HourlyEmployee inherits from Employee
public class HourlyEmployee extends Employee {

    // Stores hours worked and hourly rate
    private int hours;
    private double rate;

    // Constructor
    public HourlyEmployee(String staffId, String name, int hours, double rate) {
        super(staffId, name);

        // Check if hours or rate is negative
        if (hours < 0 || rate < 0) {
            throw new IllegalArgumentException("Hours and rate cannot be negative");
        }

        // Store hours and rate
        this.hours = hours;
        this.rate = rate;
    }

    // Calculates payment using hours multiplied by rate
    public double calculatePay() {
        return hours * rate;
    }
}
