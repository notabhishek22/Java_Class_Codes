//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Bank {
    static int Amount = 1000;//will get memory each time when the instance is created

    public int Credit(int a) {
        return Amount = Amount + a;
    }
}

class StaticVariableExample {
    public static void main(String args[]) {
        Bank gpay = new Bank();
        Bank atm = new Bank();
        System.out.println(gpay.Credit(100));//1000+100=1100
        System.out.println(atm.Credit(200));//1100+200=1300
    }
} 