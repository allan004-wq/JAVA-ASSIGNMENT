//QUESTION D
// This class tests the payroll system
public class PayrollTest {

    public static void main(String[] args) {

        // Create a salaried employee and an hourly employee
        SalariedEmployee employee1 =
                new SalariedEmployee("S001", "John", 1000000);

        HourlyEmployee employee2 =
                new HourlyEmployee("H001", "Mary", 40, 5000);

        // Store both employees in a Payable array
        Payable[] employees = {employee1, employee2};

        // Variable to store the total payroll
        double totalPayroll = 0;

        // Loop through the employees
        for (int i = 0; i < employees.length; i++) {

            // Display each employee's payment
            System.out.println("Payment: " +
                    employees[i].getPaymentAmount());

            // Add the payment to the total
            totalPayroll = totalPayroll +
                    employees[i].getPaymentAmount();
        }

        // Display the total payroll
        System.out.println("Total Payroll: " + totalPayroll);
    }
}
