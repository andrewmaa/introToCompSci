package nine;

public class Queue {

    // create data fields (b.p. 1-2)
    private int[] elements;
    private int size;

    // create constructor (b.p. 3)
    public Queue() {
        elements = new int[8];
    }

    // create method to add number (b.p. 4)
    public void enqueue(int v) {
        // if the number of elements exceeds the array size, double the array size
        if (size >= elements.length) {
            
            // create new array with double the size
            int[] temp = new int[elements.length * 2];
            
            // copy elements into new array
            System.arraycopy(elements, 0, temp, 0, elements.length);
            
            // set the old array as the updated one
            elements = temp;
        }
        // set the passed value to the next available index in the array
        elements[size] = v;
        // increase the size data field by 1
        size++;
    }

    // create method to remove number (b.p. 5)
    public int dequeue() {

        // create new array that has a smaller size
        int[] temp = new int[elements.length-1];

        // find value to be removed and returned
        int val = elements[0];
        
        // copy old array values to new array without the value being removed
        System.arraycopy(elements, 1, temp, 0, size);
        
        // set the new array as the array of elements 
        elements = temp;

        // decrease size by 1
        size--;

        // return value that was removed
        return val;
        
    }

    // returns whether the queue is empty (b.p. 6)
    public boolean empty() {
        return size == 0;
    }

    // returns the size of the queue (b.p. 7)
    public int getSize() {
        return size;
    }
}
