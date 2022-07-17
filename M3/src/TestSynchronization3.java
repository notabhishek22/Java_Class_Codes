class BookTheaterSeat3 {
    int total_seats = 10;

    void bookSeat(int seats) {
        System.out.println("Welcome :" + Thread.currentThread().getName());
        System.out.println("Good Morning :" + Thread.currentThread().getName());
        System.out.println("Entry point for : " + Thread.currentThread().getName());
        System.out.println("Current state of " + Thread.currentThread().getName() + " is " + Thread.currentThread().getState());
        synchronized (this) {
            if (total_seats >= seats) {
                System.out.println(seats + " seats booked successfully ");
                total_seats = total_seats - seats;
                System.out.println("Seats Left : " + total_seats);
            } else {
                System.out.println("Sorry seats cannot be booked ... !! ");
                System.out.println("Seats Left : " + total_seats);
            }
        }
        System.out.println("Exit point for " + Thread.currentThread().getName());
        System.out.println("Good Bye :" + Thread.currentThread().getName());
    }
}

public class TestSynchronization3 extends Thread {
    static BookTheaterSeat3 b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat3();
        TestSynchronization3 sita = new TestSynchronization3();
        sita.seats = 7;
        sita.start();

        TestSynchronization3 gita = new TestSynchronization3();
        gita.seats = 6;
        gita.start();
    }
}