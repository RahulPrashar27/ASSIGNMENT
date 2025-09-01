public class MemoryAllocationDemo {
    public static void main(String[] args) {
    
        int x = 10;
        int y = x;
        y = 20;

        System.out.println("Primitive Variables:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 99;

        System.out.println("\nReference Variables:");
        System.out.print("arr1 = ");
        for (int val : arr1) {
            System.out.print(val + " ");
        }

        System.out.print("\narr2 = ");
        for (int val : arr2) {
            System.out.print(val + " ");
        }
    }
}
