import java.util.Scanner;

public class TestReadConsole2 {
    public static void main(String[] args) {
        // Using Scanner for Getting Input using System.in[ Default Configuration is Console ]
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter some string: ");
        String myString = in.nextLine(); //This parses to string

        System.out.println("Please enter some integer: ");
        int myInt = in.nextInt(); //This parses to integer

        System.out.println("Please enter some float: ");
        float myFloat = in.nextFloat();  //This parses to float

        System.out.println("Please enter some string: ");
        String myString1 = in.nextLine(); //This parses to string

        System.out.println("*******Validation Part*******");
        System.out.println("Your input string: " + myString);
        System.out.println("Your input int: " + myInt);
        System.out.println("Your input float: " + myFloat);
    }
}