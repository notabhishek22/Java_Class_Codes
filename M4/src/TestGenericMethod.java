public class TestGenericMethod {
    // generic method printArray
    public static void printArray( int[] inputArray ) {
        // Display array elements
        for(int element : inputArray) {
            System.out.printf("%d", element);
        }
        System.out.println();
    }
    public static void printArray( char[] inputArray ) {
        // Display array elements
        for(char element : inputArray) {
            System.out.printf("%c", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create arrays of Integer, Double and Character
        int[] intArray = { 1, 2, 3, 4, 5 };
        char[] charArray = {'a','b'};
        System.out.println("Array contains:");
        printArray(intArray);   // pass an Integer array
        printArray(charArray);   // pass a Character array

    }
}