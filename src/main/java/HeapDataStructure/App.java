package HeapDataStructure;

public class App {

    public static void main(String[] args) {

        Heap newHeap = new Heap(10);
        newHeap.insert(10);
        newHeap.insert(11);
        newHeap.insert(13);
        newHeap.insert(15);
        newHeap.insert(16);
        newHeap.insert(5);
        newHeap.insert(18);
        newHeap.insert(30);
        newHeap.insert(15);
        newHeap.insert(90);

        newHeap.displayHeap();
    }


}
