//5) this: to pass as an argument in the constructor call

class B1 {
    TestThis5 obj;

    B1(TestThis5 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of TestThis5 class
    }
}

class TestThis5 {
    int data = 10;

    TestThis5() {
        B1 b = new B1(this);
        b.display();
    }

    public static void main(String[] args) {
        //B1 b=new B1(this);
        TestThis5 b1 = new TestThis5();
    }
}  