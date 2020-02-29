package sdacademy.advancedfeatures.concurrency.Example5;

public class BenchMain {

    public static void main(String[] args) {
        Bench bench = new Bench(4);
        SeatTakerThread seatTakerThread1 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread3 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread4 = new SeatTakerThread(bench);

        seatTakerThread1.start();
        seatTakerThread2.start();
        seatTakerThread3.start();
        seatTakerThread4.start();
    }
}
