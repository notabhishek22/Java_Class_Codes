//3) super is used to invoke parent class constructor.

class Animal5 {
//    Animal5() {
//        System.out.println("animal is created");
//    }
//
//    Animal5(String ar) {
//        System.out.println("animal is created " + ar);
//    }
}

class Dog11 extends Animal5 {
    Dog11() {
        //super("dog");  
        System.out.println("dog is created");
    }

    Dog11(String ss) {
        //this();
        super();
        System.out.println("dog is created " + ss);
    }
}

class TestSuper3 {
    public static void main(String[] args) {
        Dog11 d = new Dog11("abc");
    }
}  