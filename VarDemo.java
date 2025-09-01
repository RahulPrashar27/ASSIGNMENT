public class VarDemo {
    public static void main(String[] args) {
        // Using var for type inference
        var num = 10;             // int
        var price = 99.99;        // double
        var name = "Java";        // String
        var isActive = true;      // boolean

        System.out.println("num (int): " + num);
        System.out.println("price (double): " + price);
        System.out.println("name (String): " + name);
        System.out.println("isActive (boolean): " + isActive);

        var list = java.util.List.of("A", "B", "C");
        System.out.println("list (List<String>): " + list);

    }
}
