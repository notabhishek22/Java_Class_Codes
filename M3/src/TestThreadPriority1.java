class TestThreadPriority1 extends Thread {
    public void run() {
        System.out.println("I'm thread : " + Thread.currentThread().getName());
        System.out.println("I'm Priority :" + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        TestThreadPriority1 t1 = new TestThreadPriority1();
//        System.out.println(t1.getState());
        TestThreadPriority1 t2 = new TestThreadPriority1();
//        System.out.println(t2.getState());

        t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)

        t1.start();
        t2.start();

    }
} 