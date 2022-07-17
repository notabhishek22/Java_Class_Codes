public class TestMultipleCatchBlock {
    public static void main(String[] args) {

        try {
//            int[] a = new int[5];
//            a[5]=30/2;
            int[] b = null;
            System.out.println(b.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (ArithmeticException e) {
            System.out.println("Parent Exception occurs");
        } catch (Exception e) {
            System.out.println("Null Pointer Exception occurs" + e);
        }
        System.out.println("rest of the code");
    }
}