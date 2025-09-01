public class CharVsString {
    public static void main(String[] args) {
        
        char ch = 'A';

        String str = "Hello";


        System.out.println("char value: " + ch);
        System.out.println("String value: " + str);

        System.out.println("\nDifferences:");
        System.out.println("1. char holds only one character: '" + ch + "'");
        System.out.println("2. String can hold multiple characters: \"" + str + "\"");

        System.out.println("3. char is a primitive data type.");
        System.out.println("4. String is an object (class) in Java.");
    }
}
