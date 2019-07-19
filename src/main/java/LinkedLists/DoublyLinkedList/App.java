package LinkedLists.DoublyLinkedList;

public class App {

    public static void main(String[] args) {

        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(1);
        theList.insertFirst(2);
        theList.insertFirst(3);

        theList.insertLast(6);
        theList.insertLast(5);
        theList.insertLast(4);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(5);

        theList.displayForward();
        theList.displayBackward();

        theList.insertAfter(1, 99);
        theList.insertAfter(6,100);

        theList.displayForward();
    }
}
