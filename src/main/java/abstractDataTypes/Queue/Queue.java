package abstractDataTypes.Queue;

public class Queue {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // index position for first slot of the array
        rear = -1; //there is no item in the array yet to be consider as the last item
        nItems = 0; // we don't have elements in the array yet
    }

    public void insert(long j) {

        if(rear == maxSize -1) {
            rear =1; // we will bring it back to the beggining and start overwritting
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public void view() {
        System.out.print("[ ");
        for(int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }

    public long remove() { //remove item from the front of the queue
        long temp = queArray[front];
        front++;
        if(front == maxSize) {
            front = 0;//so that we can use the array again
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

}
