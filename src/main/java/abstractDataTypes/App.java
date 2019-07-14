package abstractDataTypes;

import java.util.LinkedList;

public class App {

    public static void main(String args[]) {

        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        //System.out.println(myCounter.getCurrentValue());

        LinkedList myList = new LinkedList();

        //NEW chapter - Stack

        Stack theStack = new Stack(3);
        theStack.push('t');
        theStack.push('c');
        theStack.push('b');
        theStack.push('a');

        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

        theStack.pop();

    }

    public static String reverseString(String str) {
        return str;
    }

}
