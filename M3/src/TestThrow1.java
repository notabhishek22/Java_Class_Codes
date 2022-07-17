public class TestThrow1 {
    //defining a method  
    public static void checkNum(int num) {
        if (num < 0) {
//            throw new ArithmeticException("Hahahaha!");
            throw new NullPointerException("Number is negative, cannot calculate square");
        } else {
            System.out.println("Square of " + num + " is " + (num * num));
        }
    }


    //main method
    public static void main(String[] args) {
        checkNum(-3);
//        try {
//            checkNum(-3);
//        } catch (NullPointerException e) {
//            System.out.println(e);
//        }
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//    }
        System.out.println("Rest of the code..");
    }
}  