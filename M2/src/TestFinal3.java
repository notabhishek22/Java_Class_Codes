class Bikee {
    final void run() {
        System.out.println("running");
    }

    void run(int i) { //Can be Overloaded
        System.out.println("Value of i=" + i);
    }
}

class TestFinal3 extends Bikee {
//    void run() { //Cannot be Overridden(Final method hai)
    void runn() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String[] args) {
//        TestFinal3 honda = new TestFinal3();
        Bikee b = new Bikee();
        b.run();
        b.run(10);
//        honda.run(7);
    }
} 