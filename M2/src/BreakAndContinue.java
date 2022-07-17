public class BreakAndContinue {
    public static void main(String[] args) {
        // Break and continue using loops!

        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            System.out.println(i);
            System.out.println("Java is great");

        } while (i < 5);
        System.out.println("Loop ends here");
    }
}
