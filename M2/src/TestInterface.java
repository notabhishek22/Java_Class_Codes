interface Animall {
    int a = 10;

    void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

class Pig implements Animall {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class TestInterface1 {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        //Animal.a=10;
    }
}