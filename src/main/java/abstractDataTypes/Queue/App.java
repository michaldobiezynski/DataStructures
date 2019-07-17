package abstractDataTypes.Queue;

public class App {

    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(1);
        myQueue.insert(99);
        myQueue.insert(555);
        myQueue.insert(423);
        myQueue.insert(7);

        myQueue.view();
    }
}
