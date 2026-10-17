// Define interface Y
public interface Y {

    // Constant with value 10
    int W = 10;

    // Static method that prints a message
    public static void m() {
        System.out.println("I am from Y");
    }

    // Default method that returns the square of an integer
    default int b(int number) {
        return number * number;
    }
}
