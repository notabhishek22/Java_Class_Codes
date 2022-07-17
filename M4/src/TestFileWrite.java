import java.io.*;
//import java.util.Scanner;

class TestFileWrite{
    public static void main(String[] args) {
        //This writes to a file--------
        try{
            FileWriter f1 = new FileWriter("/home/vallhalla/Desktop/javaFileCreation1.txt\n");
            f1.write("hi Welcome\nThis is my first file\nok bye\n");
            String str = "file reading and file writing";
            f1.append(str);
            f1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}