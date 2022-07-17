//import java.util.jar.Attributes.Name;

class Student2 {
    int rollno;
    String name;
    static String college = "IIIT Lucknow";

    //static method to change the value of static variable
    static void change() {
        college = "IIT Kharagpur";
        //name = "Arjun";
    }

    Student2(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    {
        System.out.println("Block");
    }
}

public class TestStaticMethod {
    public static void main(String[] args) {
        Student2.change();//calling change method
//        Student2.college = "IIT KGP";
        Student2 s1 = new Student2(111, "Karan");
        Student2 s2 = new Student2(222, "Aryan");
        Student2 s3 = new Student2(333, "Sonoo");

        s1.display();
        s2.display();
        s3.display();
    }
}