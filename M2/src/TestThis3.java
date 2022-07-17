//3) this() : to invoke current class constructor

class B {

    B() {
        //this();
        System.out.println("hello a");
    }

    B(int x) {
        this();
        System.out.println(x);
    }
}

class TestThis3 {
    public static void main(String[] args) {
        new B(10);
    }
}  