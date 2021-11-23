import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class DequeueMethods {

    public static void main(String args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        /* take() will block until an element becomes available
         * so if an element is already enqueued inside the blocking queue take will
         * return it immediately, but if not it will block until an element is inserted by another thread */
        try {
            String element = blockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /* other way to dequeue is using the poll method, this returns the first element in the queue
         * if there is no first element in the queue poll will return null */
        String element2 = blockingQueue.poll();

        /* the BlockingQueue interface also contains a version of the poll method which takes a
         * timeout. This version of th epoll method waits up until 1000 ms passes for an element to become
         * available in the blocking queue before returning null */
        try {
            String element3 = blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // removes an element in the BlockingQueue if its present
        boolean wasRemoved = blockingQueue.remove("1");
    }
}
