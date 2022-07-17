//2) super can be used to invoke parent class method

class Animal4 {
    void eat() {
        System.out.println("Animal eating...");
    }
}

class Dog1 extends Animal4 {
    void eat() {
        System.out.println("Dog eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class TestSuper2 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.work();
        //d.eat();
    }
} 