class Test {
    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    // Constructor calling
    Test() {
        System.out.println("Constructor called");
    }

    // Case 3: Static blocks
    static {
        i = 10;
        System.out.println("static block called ");
    }

    static {
        System.out.println("static1 block called ");
    }

    static void pp() {
        System.out.println("static method");
    }
}

class TestStaticBlock {
    public static void main(String[] args) {
        // Although we have two objects, static block is
        // executed only once.
        System.out.println(Test.i);
        Test t1 = new Test();
        System.out.println(Test.i);
        Test t2 = new Test();
        System.out.println(Test.i);
        Test.pp();
    }
}