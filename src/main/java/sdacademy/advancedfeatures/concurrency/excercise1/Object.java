package sdacademy.advancedfeatures.concurrency.excercise1;

public class Object implements Runnable {

    private int value;
    private boolean running;

    public Object(int value) {
        this.value = value;
        this.running = true;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello" + value);
            modifyValue();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int modifyValue() {
       return value--;
    }

    public void stopThread() {
        if (value < 0)
       running = false;
    }
}
