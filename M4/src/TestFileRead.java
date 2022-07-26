import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class TestFileRead {
    public static void main(String[] args) throws IOException {
        //This reads from a file--------
        File f3 = new File("/home/vallhalla/Desktop/javaFileCreation1.txt\n");
        try {
            Scanner sc = new Scanner(f3);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        //this deletes a file---------
        if(f3.delete()){
            System.out.println("I have deleted "+ f3.getName());
        }
        else{
            System.out.println("File is not deleted");
        }
    }
}