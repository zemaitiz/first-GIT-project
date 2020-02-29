package sdacademy.advancedfeatures.concurrency.Example1;


import org.apache.log4j.Logger;

public class Example1 {


    private static final Logger logger = Logger.getLogger(Example1.class);

    public static void main(String[] args) {
        logger.info("Main thread starts");

        try {
            Thread.sleep(2000);
            logger.info("Main thread is still running");
            Thread.sleep(3000);
            logger.info("Main thread ends");
        } catch (InterruptedException e) {
            logger.error("Thread was interrupted on sleep", e);
        }
    }
}
