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

        while(!theStack.isEmpty()) {
            char value = theStack.pop();
            System.out.println(value);
        }

        reverseString("Hello");

    }

    public static String reverseString(String str) {

        Stack newStack = new Stack(str.length());
        StringBuilder stringBuilder = new StringBuilder();
        String reversedString = "";

        for(int i = 0; i<str.length(); i++) {
            newStack.push(str.charAt(i));
        }

        while(!newStack.isEmpty()) {
             stringBuilder.append(newStack.pop());
        }

        reversedString = stringBuilder.toString();

        System.out.println(reversedString);

        return reversedString;
    }

}
