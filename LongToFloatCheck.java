public class LongToFloatCheck {
    public static void main(String[] args) {
        long longValue = 123456789123456789L;

        float floatValue = (float) longValue;

        System.out.println("Original long value: " + longValue);
        System.out.println("Converted float value: " + floatValue);

        if (longValue == (long) floatValue) {
            System.out.println("The long value can be stored in float without loss of precision.");
        } else {
            System.out.println("The long value cannot be stored in float accurately (precision loss occurs).");
        }
    }
}
