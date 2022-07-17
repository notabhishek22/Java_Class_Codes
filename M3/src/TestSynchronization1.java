class BookTheaterSeat {
    int total_seats = 10;

    void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats booked successfully ");
            total_seats = total_seats - seats;
            System.out.println("Seats Left : " + total_seats);
        } else {
            System.out.println("Sorry seats cannot be booked ... !! ");
            System.out.println("Seats Left : " + total_seats);
        }
    }
}

public class TestSynchronization1 extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        TestSynchronization1 sita = new TestSynchronization1();
        sita.seats = 7;
        sita.start();

        TestSynchronization1 gita = new TestSynchronization1();
        gita.seats = 6;
        gita.start();
    }
}