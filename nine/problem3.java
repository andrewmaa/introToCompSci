package nine;

public class problem3 {
    public static void main(String[] args) {

        // create new queue
        Queue myQueue = new Queue();

        // add numbers 1 through 20
        for (int num = 0; num < 20; num++) {
            myQueue.enqueue(num + 1);
        }

        // displays all values as they are dequeued
        System.out.println("Values in the queue: ");
        int size = myQueue.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println("Value " + (i+1) + " is: " + Integer.toString(myQueue.dequeue()));
        }
    }
}
