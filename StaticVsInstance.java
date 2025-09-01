public class StaticVsInstance {

    int instanceVar = 10;

    static int staticVar = 20;

    public static void main(String[] args) {

        StaticVsInstance obj1 = new StaticVsInstance();

        StaticVsInstance obj2 = new StaticVsInstance();

        obj1.instanceVar = 30;
        obj1.staticVar = 40;

        System.out.println("Object 1 -> instanceVar: " + obj1.instanceVar + ", staticVar: " + obj1.staticVar);
        System.out.println("Object 2 -> instanceVar: " + obj2.instanceVar + ", staticVar: " + obj2.staticVar);
    }
}
