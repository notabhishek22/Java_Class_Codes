package mypack;

import java.util.Scanner;

class TestPack5 {
    /*it is an error bcoz.. Scanner is available in
     * Java.util.Scanner.So we have to import Java.util.Scanner; */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = read.nextInt();
        System.out.println("You have entered a number " + i);
    }
}