class Box <T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
class TestGenericClass{
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        Box<Double> doubleBox = new Box<Double>();

        integerBox.add(10);
        stringBox.add("Hello World");
        doubleBox.add(1.1);


        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
        System.out.printf("Double Value :%f \n", doubleBox.get());
    }
}