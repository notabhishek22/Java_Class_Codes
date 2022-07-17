// Example of non-static class or inner class

//import ClassA.ClassB;

class ClassA {
    static int x = 10;
    private int y = 20;
    public int z = 30;
    ClassA(){
        System.out.println("ClassA Hahahaha");
    }
    class ClassB {
        void get() {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
        }
    }
}

class InnerClassDemo {
    // Main driver method
    public static void main(String[] args) {
//        ClassA ob1 = new ClassA();
        ClassA.ClassB ob2 = new ClassA().new ClassB(); //Outer class ke object ke Bina Inner class ka object nahi Bana Sakte!
        ob2.get();
    }
}