interface FirstInterface1 {
    public void myMethod(); // interface method
}

interface SecondInterface1 extends FirstInterface1 {
    public void myOtherMethod(); // interface method
}

class DemoClass1 implements SecondInterface1 {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class TestInterface3 {
    public static void main(String[] args) {
        DemoClass1 myObj = new DemoClass1();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}