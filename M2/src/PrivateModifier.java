class Data {
    // private variable
    private String name;
}

class Data1 {
    private String name;

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return this.name;
    }
}

public class PrivateModifier {
    public static void main(String[] ar) {

        //Data d = new Data();
        //d.name = "Programiz";

        Data1 d1 = new Data1();
        d1.setName("Accessing Private Variable");
        System.out.println(d1.getName());

    }
}
