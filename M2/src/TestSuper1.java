//1) super is used to refer immediate parent class instance variable.

class Animal3 {
    String color = "white";
}

class Animal34 extends Animal3 {
    static String color = "red";
//String color = "red";
}

class Dog extends Animal34 {
    String color = "black";

    void printColor() {
        System.out.println(color);
//        System.out.println(super.color);
        System.out.println(Animal34.color);
    }
}

class TestSuper1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}  