package LinkedLists.SInglyLinkedList;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(101);
        myList.insertFirst(102);
        myList.insertFirst(103);
        myList.insertFirst(104);
        myList.insertLast(9999999);

        myList.displayList();
    }

}
