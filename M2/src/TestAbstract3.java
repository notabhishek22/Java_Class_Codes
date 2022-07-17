// Java Program to illustrate Abstract class
// Without any abstract method
abstract class Base1 {
    void fun() {
        System.out.println("Function of Base class is called");
    }
}

class Derived1 extends Base1 {

}

class TestAbstract3 {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
        d.fun();
    }
}

