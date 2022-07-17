class BookTheaterSeat4 {
    static int total_seats = 10;

    synchronized void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats booked successfully by " + Thread.currentThread().getName());
            total_seats = total_seats - seats;
            System.out.println("Seats Left : " + total_seats);
        } else {
            System.out.println("Sorry seats cannot be booked by " + Thread.currentThread().getName());
            System.out.println("Seats Left : " + total_seats);
        }
    }
}

public class TestSynchronization4 extends Thread {

    static BookTheaterSeat4 b, b1;
    int seats;

    TestSynchronization4(BookTheaterSeat4 obj, int seats) {
        b = obj;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat4();

        b1 = new BookTheaterSeat4();
        TestSynchronization4 deepak = new TestSynchronization4(b, 4);
        deepak.start();

        TestSynchronization4 amit = new TestSynchronization4(b, 2);
        amit.start();

        TestSynchronization4 sapna = new TestSynchronization4(b1, 3);
        sapna.start();

        TestSynchronization4 arpita = new TestSynchronization4(b1, 2);
        arpita.start();

    }
}