// Java program to demonstrate BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReadConsole1 {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter some string: ");
        String myString = in.readLine(); //This parses to string

        System.out.println("Please enter some integer: ");
        int myInt = Integer.parseInt(in.readLine()); //This parses to integer

        System.out.println("Please enter some float: ");
        float myFloat = Float.parseFloat(in.readLine());  //This parses to float

        System.out.println("*******Validation Part*******");
        System.out.println("Your input string: " + myString);
        System.out.println("Your input int: " + myInt);
        System.out.println("Your input float: " + myFloat);
    }
}

