public class WrapperConversionDemo {
    public static void main(String[] args) {
        int num = 255;

        String binary = Integer.toBinaryString(num);

        String hex = Integer.toHexString(num);

        String octal = Integer.toOctalString(num);

        System.out.println("Number: " + num);
        System.out.println("Binary representation: " + binary);
        System.out.println("Hexadecimal representation: " + hex);
        System.out.println("Octal representation: " + octal);
    }
}
