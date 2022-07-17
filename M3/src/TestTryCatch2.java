public class TestTryCatch2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 2; //may throw exception
            System.out.println("rest of the code");
        } catch (ArithmeticException e)  //catch(Exception e)
        {
            System.out.println(e);
        }
        /*catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        } */
        System.out.println("After Catch Block");

    }

}