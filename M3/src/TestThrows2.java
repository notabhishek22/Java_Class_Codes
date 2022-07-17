import java.io.File;
import java.io.IOException;

class TestThrows2 {
    public static void findFile() throws IOException, NullPointerException, ArithmeticException {
        File newFile = new File("test.txt");
        //FileInputStream stream=new FileInputStream(newFile);

        int a[] = null;
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
            //System.out.println("Catch1 = "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Catch2 = " + e.getClass());
        }

        System.out.println("outside catch");
    }
}
