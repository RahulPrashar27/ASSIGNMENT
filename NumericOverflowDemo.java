public class NumericOverflowDemo {
    public static void main(String[] args) {
        // Example with byte (range: -128 to 127)
        byte b = 127;
        System.out.println("Initial byte value: " + b);

        b++; // Overflow (wraps around)
        System.out.println("After increment (overflow): " + b);

        // Example with int (range: -2,147,483,648 to 2,147,483,647)
        int maxInt = Integer.MAX_VALUE;
        System.out.println("\nMaximum int value: " + maxInt);

        int overflowInt = maxInt + 1; // Overflow
        System.out.println("After adding 1 (overflow): " + overflowInt);

        int minInt = Integer.MIN_VALUE;
        System.out.println("\nMinimum int value: " + minInt);

        int underflowInt = minInt - 1; // Underflow
        System.out.println("After subtracting 1 (underflow): " + underflowInt);
    }
}
