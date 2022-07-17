package mypack;

class TestPack4 {
    public static void main(String[] args) {
        pack.TestPack obj = new pack.TestPack();//using fully qualified name
        obj.msg();

        System.out.println("value of a= " + TestPack2.a);
    }
}