class Viva extends Thread {
    public void run() {
        System.out.println("Thread started " + currentThread().getName());
        System.out.println("Current State of " + currentThread().getName() + " is " + currentThread().getState());
    }
}

public class Main {
    public static void main(String[] args) {
        Viva v1 = new Viva();
        System.out.println("State of v1 = " +  v1.getState());
        Viva v2 = new Viva();
        Viva v3 = new Viva();
        Viva v4 = new Viva();
        Viva v5 = new Viva();
        //We can even set priority.
        v1.start();
        v2.start();
        System.out.println("Checking if v2 is alive: " + v2.isAlive());
        v3.start();
        v4.start();
        v5.start();

//        System.out.println("State of v5 = " + v5.getState());
    }
}
