package LinkedLists.DoublyLinkedList;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode; // if empty, last will refer to the new node being created
        } else {
            first.previous = newNode;
        }

        newNode.next = first;//the new node's next feild will point to the old first
        this.first = newNode;

    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
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
        if (first.next == null) {//there is only one item in the list
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
        if (first.next == null) { //we only have one node in this list
            first = null;
        } else {
            last.previous.next = null; //the last node's previous node's next field will point to null
        }

        last = last.previous;
        return temp;
    }

    //assume non-empty list
    public boolean insertAfter(int key, int data) {
        Node current = first; // we start from the beginning of the list
        while (current.data != key) { //as long as we have not found the key in the particular node
            current = current.next;
            if (current == null) { // we have reached the end of the list
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next; //new node's next feild should point to the node ahead of the current one
            current.next.previous = newNode; // the node ahead of current, it's previous feild should point to the new node
        }

        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    //assume non-empty list
    public Node deleteKey(int key) {
        Node current = first; // we start from the beginning of the list
        while (current.data != key) { //as long as we have not found the key in the particular node
            current = current.next;
            if (current == null) { // we have reached the end of the list
                System.out.println("That node does not exist");
                return null;
            }
        }

        if(current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if(current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward() {
        System.out.println("List (first --> last");
        Node current = first;
        while(current != null) {
            current.displatNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List (last --> first");
        Node current = last;
        while(current != null) {
            current.displatNode();
            current = current.previous;
        }
        System.out.println();
    }

}















