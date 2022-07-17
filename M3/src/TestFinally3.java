//This example shows the working of finally block when an exception occurs
// in try block but is not handled in the catch block:

class TestFinally3 {
    public static void main(String[] args) {
        try {
            System.out.println("First statement of try block");
            int num = 45 / 2;
            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }
}