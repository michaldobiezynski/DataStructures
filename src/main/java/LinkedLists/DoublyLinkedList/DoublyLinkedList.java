package LinkedLists.DoublyLinkedList;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return(first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            last = newNode; // if empty, last will refer to the new node being created
        } else {
            first.previous = newNode;
        }

        newNode.next = first;//the new node's next feild will point to the old first
        this.first = newNode;

    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; //assigning old last to new node
            newNode.previous = last; //the odl last will be new node's previous
        }
        last = newNode;
    }

    //assume non-empty list
    public Node deleteFirst() {
        Node temp = first;
        if(first.next == null) {//there is only one item in the list
            last = null;
        } else {
            first.next.previous = null; //the list's first node will point to null
        }
        first = first.next; // we are assinging the reference of the
                            // node following the old first node to the first field in the linked list object

        return temp; // return the delete old first node
    }

    //assume non-empty list
    public Node deleteLast() {
        Node temp = last;
        if(first.next == null) { //we only have one node in this list
            first = null;
        } else {
            last.previous.next = null; //the last node's previous node's next field will point to null
        }

        last = last.previous;
        return temp;
    }

}
