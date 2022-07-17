class BookTheaterSeat2 {
    int total_seats = 10;

    synchronized void bookSeat(int seats) {
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

public class TestSynchronization2 extends Thread {
    static BookTheaterSeat2 b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat2();

        TestSynchronization2 sita = new TestSynchronization2();
        TestSynchronization2 gita = new TestSynchronization2();
        gita.seats = 6;
        sita.seats = 7;
        gita.start();
        sita.start();

    }
}