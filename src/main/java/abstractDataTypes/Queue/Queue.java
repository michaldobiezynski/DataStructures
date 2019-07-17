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
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public void view() {
        System.out.print("[");
        for(int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }

}
