public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        
        int primitiveInt = 50;
        Integer wrapperInt = primitiveInt;

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);

        Integer obj = new Integer(100);
        int num = obj;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Integer: " + obj);
        System.out.println("Primitive int: " + num);
    }
}
