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
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);


        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

    }

}
