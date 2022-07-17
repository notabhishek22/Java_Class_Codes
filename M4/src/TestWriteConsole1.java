public class TestWriteConsole1 {
    public static void main(String[] args) {
        System.out.println("***I am System.out.print. I print the passed string***");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }

        System.out.println("\n***I am System.out.println. I print the passed string and end with a new line***");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("***I am System.out.write. I accept the int byte-val as input parameter ***");
        for (int x = 65; x <= 70; x++) {
            System.out.write(x);
            System.out.write('\n');
        }
    }
}