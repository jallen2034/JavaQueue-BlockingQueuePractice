import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

// example of methods you can use insert elements into a blocking queue
public class EnqueueMethods {

    public static void main(String[] arrgs) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        /* put() will attempt to insert an element into the queue to enqueue an element, but if the queue does
         * not have space for that element internally, that put method will block until the blockingqueue
         * has space internally for the element */
        try {
            blockingQueue.put("1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /* The add method is the second type of method you can use to enqueue elements into a blocking queue
         * The add method will not block if there is no space inside the BlockingQueue
         * it throws an IllegalStateException instead if there is not space for new elements*/
        try {
            blockingQueue.add("2");
        } catch (IllegalStateException e) {

        }

        /* the offer method is the 3rd type. It will not block either, it will return true or false if
         * the element was enqueued or not */
        boolean wasEnqueued = blockingQueue.offer("3");

        /* Final type is an offer method which takes a timeout
         * It will attempt to enqueue an element into the queue but if there is no space it will wait 1000 ms
         * for space to become available */
        try {
            blockingQueue.offer("3", 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
