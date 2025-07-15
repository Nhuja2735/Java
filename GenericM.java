//WAP to Print any type of array's all elements using Generic method.
public class GenericM {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test with different types of arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);

        System.out.println("Double Array:");
        printArray(doubleArray);
    }
}
