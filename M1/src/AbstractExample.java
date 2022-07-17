abstract class Bike {
    abstract void run();

    public void sleep() {
        System.out.println("Parent is sleeping");
    }
}

class Cycle extends Bike {
    public void brake() {
        System.out.println("My cycle have brake");
    }

    void run() {
        System.out.println("Cycle running safely");
    }

    @Override
    public void sleep() {
        System.out.println("Cycle class ka sleep method");
    }
}

class AbstractExample extends Bike {
    public static void main(String[] args) {
//        AbstractExample obj = new AbstractExample();
//        obj.run();
//        obj.sleep();

//        Bike b1 = new Bike();
//        b1.run();
//        b1.sleep();

//        Cycle c1 = new Cycle();
//        c1.run();

        Bike kaObj = new Cycle();
        kaObj.run();
        kaObj.sleep();

    }

    void run() {
        System.out.println("Bike running safely");
    }
}