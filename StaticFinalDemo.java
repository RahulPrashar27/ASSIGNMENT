public class StaticFinalDemo {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        double radius = 5.0;

        double area = PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Using static final PI: " + PI);
        System.out.println("Area of Circle: " + area);

    }
}
