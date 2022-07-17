class ClassA1 {
    static int x = 10;
    int y = 20;
    private static int z = 30;

    static class ClassB1 {
        public void get() {
            System.out.println("x: " + x);
            System.out.println("z: " + z);
//          System.out.println(y);
        }
    }

    static class ClassC1 {
        public void get() {
            System.out.println("x: " + x);
            System.out.println("z: " + z);
            //System.out.println(y);
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        ClassA1.ClassB1 ob1 = new ClassA1.ClassB1();
        ob1.get();

        ClassA1.ClassC1 ob2 = new ClassA1.ClassC1();
        ob2.get();
    }
}