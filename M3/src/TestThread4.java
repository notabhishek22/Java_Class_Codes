class th1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("Thread 1 for Playing");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class th2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("Thread 2 for Cooking");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class TestThread4 {
    public static void main(String[] args) {
        th1 obj1 = new th1();
        Thread t1 = new Thread(obj1);

        th2 obj2 = new th2();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}