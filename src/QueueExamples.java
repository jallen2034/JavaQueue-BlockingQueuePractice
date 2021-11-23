import java.util.LinkedList;
import java.util.Queue;

// example of a simple queue implementation in Java
public class QueueExamples {

    public static void main(String[] args) {

        // implementation of queue with primitive constraints
        Queue<Customer> queue1 = new LinkedList<>();
        queue1.add(new Customer(1, "Jacob@hotmail.com"));
        queue1.add(new Customer(2, "henry@hotmail.com"));

        // look at first element in queue1 without removing it from queue1
        Customer firstCustomer = queue1.peek();
        System.out.println("firstCustomer: " + firstCustomer);
        System.out.println("queue1.size after peek but before poll: " + queue1.size());

        Customer customer1 = queue1.poll();
        Customer customer2 = queue1.poll();

        System.out.println("queue1.size after poll: " + queue1.size());

        // implementation of queue without primitive constraints allowing to add both a customer object and a string to it
        Queue queue2 = new LinkedList();
        queue2.add(new Customer(1, "Jacob@hotmail.com"));
        queue2.add("John");

        // drain elements from trhe second queue and typecast them to customer 3 and 4 variables
        Customer customer3 = (Customer) queue2.poll();
        String customer4 = (String) queue2.poll();

        System.out.println("customer1: " + customer1);
        System.out.println("customer2: " + customer2);
        System.out.println("customer3: " + customer3);
        System.out.println("customer4: " + customer4);
    }
}
