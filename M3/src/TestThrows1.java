import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class TestThrows1 {
    public static void findFile() throws IOException {
//        File newFile = new File("/home/vallhalla/Desktop/Java Codes/M3/src/test.txt");
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        // findFile();
        try {
            findFile();
        } catch (Exception e) {
            System.out.println("You are in Catch Block " + e);
        }
    }
}

