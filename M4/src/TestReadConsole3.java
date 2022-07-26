import java.io.Console;

public class TestReadConsole3 {
    public void passwordExample() {
        Console c = System.console();
        char[] password = c.readPassword();
        for(char x : password) {
            System.out.print(x);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new TestReadConsole3().passwordExample();
    }
}