// Abstract parent class
abstract class Account {

    private double balance;

    // Abstract method has no body
    public abstract double interest();

    // Abstract method to close the account
    public abstract void close();
}
