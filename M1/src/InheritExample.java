class Parent {
    public void runn() {
        System.out.println("Running Safely");
    }
}

class child extends Parent {
    public void eat() {
        System.out.println("Child is Eating");
    }
}

class InheritExample {

    public static void main(String[] args) {
        child c1 = new child();
        c1.eat();
        c1.runn();
    }
}