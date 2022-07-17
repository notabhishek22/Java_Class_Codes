import java.io.*;
//import java.util.Scanner;

class TestFileCreate{
    public static void main(String[] args) throws IOException{
        //This creates a File--------
        File f = new File("/home/vallhalla/Desktop/javaFileCreation1.txt\n");
        //f.createNewFile();
        try {
            f.createNewFile();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}