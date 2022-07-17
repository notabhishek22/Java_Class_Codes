class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal ");
    }
}

class ProtectedModifier {
    public static void main(String[] args) {
        Animal aa = new Animal();
        aa.display();
    }
}