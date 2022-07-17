//6) this keyword can be used to return current class instance

class A33 {
    A33() {
        System.out.println("parent1 class");
    }
//    int x = 10;
//    A33(int x){
//        this.x = x;
//        System.out.println("Hahahah, This Constructor!");
//    }

    A33 getA() {
        return this;
    }

    void msg() {
        System.out.println("Hello java");
    }
}

class A32 extends A33 {
    A32() {
        System.out.println("parent2 class");
    }
}

class TestThis6 extends A32 {
    TestThis6(int a) {
        System.out.println("child class " + a);
    }

    public static void main(String[] args) {
       /* A33 a = new A33(); 
        System.out.println("a=="+ a);
        System.out.println(new A33().getA());
        new A33().msg();*/

        TestThis6 t = new TestThis6(5);
    }
} 