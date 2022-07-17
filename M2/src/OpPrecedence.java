public class OpPrecedence {
    public static void main(String[] args) {
        // Precedence & Associativity

        int a = 6 * 5 - 34 / 2;
        int b = 60 / 5 - 34 * 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x = 6;
        int y = 1;
        int k = (x * y) / 2;
        System.out.println("k = " + k);

        int b1 = 0;
        int c = 0;
        int a1 = 10;
        int k1 = b1 * b1 - (4 * a1 * c) / (2 * a1);
        System.out.println("k1 =" + k1);

    }
}