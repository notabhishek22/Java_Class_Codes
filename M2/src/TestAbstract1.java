abstract class GPS {
    abstract void path();
    abstract void call();
}

class SmartPhone extends GPS {
    void path() {
        System.out.println("Finding path...");
    }

    void call() {
        System.out.println("calling...");
    }
}

class TestAbstract1 {
    public static void main(String[] args) {
//        SmartPhone obj = new SmartPhone();
         GPS obj = new SmartPhone();
//        Smartphone obj1 = new GPS();

        obj.path();
        obj.call();
    }
}  