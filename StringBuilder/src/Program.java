// Java code to illustrate StringBuilder

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Program {
    public static void main(String[] argv)
            throws Exception
    {

        // create a StringBuilder object
        // usind StringBuilder() constructor
        StringBuilder str
                = new StringBuilder();

        str.append("GFG");

        // print string
        System.out.println("String = "
                + str.toString());

        // create a StringBuilder object
        // usind StringBuilder(CharSequence) constructor
        StringBuilder str1
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String1 = "
                + str1.toString());

        // create a StringBuilder object
        // usind StringBuilder(capacity) constructor
        StringBuilder str2
                = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = "
                + str2.capacity());

        // create a StringBuilder object
        // usind StringBuilder(String) constructor
        StringBuilder str3
                = new StringBuilder(str1);

        // print string
        System.out.println("String3 = "
                + str3.toString());



        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str4
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String = "
                + str4.toString());

        // reverse the string
        StringBuilder reverseStr = str4.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr.toString());

        // Append ', '(44) to the String
        str4.appendCodePoint(44);

        // Print the modified String
        System.out.println("Modified StringBuilder = "
                + str4);

        // get capacity
        int capacity = str4.capacity();

        // print the result
        System.out.println("StringBuilder = " + str4);
        System.out.println("Capacity of StringBuilder = "
                + capacity);


    }
}
