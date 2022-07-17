class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4) {
            System.out.println("My Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

public class TestThread1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}