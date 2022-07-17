public class TestTryCatch1 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        //handling the exception
        catch (ArithmeticException e) {
            System.out.println("you are in Catch Block " + e);
        }
        System.out.println("rest of the code");
    }

}