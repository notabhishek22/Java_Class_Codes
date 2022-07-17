class Parent {
    public void runn() {
        System.out.println("parent is Running Safely");
    }

    Parent() {
        System.out.println("parent constructor");
    }
}

class Parent1 extends Parent {
    @Override
    public void runn() {
        System.out.println("parent1 is Running Safely");
    }

    Parent1() {
        System.out.println("parent1 constructor");
    }
}

class child extends Parent1 {
    public void eat() {
        System.out.println("Child is Eating");
    }

    child() {
        System.out.println("child constructor");
    }
}

class InheritExample1 {
    public static void main(String []args) {
        child c1 = new child();
        c1.eat();
        c1.runn();
    }
}