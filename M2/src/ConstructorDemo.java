class DefaultConstructor{
    int id;
    String name;
}
class NoArgConstructor{
    int id;
    String name;
    public NoArgConstructor(){
        System.out.println("Invoking No-Argument constructor");
    }
    public void display(){
        System.out.println(id + " " + name);
    }
}
class ParamConstructor{
    int id, age;
    String name;
    public ParamConstructor(int i, String n){
        id = i;
        name = n;
    }
    //Constructor Overloading
    public ParamConstructor(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    //copy constructor
    public ParamConstructor(ParamConstructor ref){
        System.out.println("Invoking copy constructor");
        id = ref.id;
        name = ref.name;
//        age = ref.age;
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }
}

class ConstructorDemo{
    public static void main(String args[]){
//         DefaultConstructor d1 = new DefaultConstructor();
//         System.out.println(d1.id + " " + d1.name);

//        NoArgConstructor s1 = new NoArgConstructor();
//        s1.display();

//        ParamConstructor s2 = new ParamConstructor(1,"abc");
//        ParamConstructor s2 = new ParamConstructor(); //Error
//        s2.display();

        ParamConstructor s3 = new ParamConstructor(2, "name", 20);//overloading
        s3.display();

        ParamConstructor s4 = new ParamConstructor(s3);//copy constructor
        s4.display();
    }
}  