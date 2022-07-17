
class Animal1 {
    public int legCount1;

    public void display1() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount1 + " legs.");
    }
}

public class PublicModifier {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.legCount1 = 6;
        animal.display1();
    }
}