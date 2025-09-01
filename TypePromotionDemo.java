public class TypePromotionDemo {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
 
        int sum = b1 + b2;  
        System.out.println("byte + byte promoted to int: " + sum);

        char ch = 'A';
        int result = ch + 1;
        System.out.println("char + int promoted to int: " + result);

        int i = 100;
        long l = 200;
        long res1 = i + l;
        System.out.println("int + long promoted to long: " + res1);

        float f = 3.5f;
        res1 = i + (long) f;
        float res2 = i + f;
        System.out.println("int + float promoted to float: " + res2);

        double d = 5.99;
        double res3 = f + d;
        System.out.println("float + double promoted to double: " + res3);
    }
}
