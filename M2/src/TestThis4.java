// 4) this: to pass as an argument in the method
class S2{
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
        System.out.println(this);
    }
}

class TestThis4{
    public static void main(String []args){
        S2 s1 = new S2();
        s1.p();
        System.out.println(s1);
    }
}