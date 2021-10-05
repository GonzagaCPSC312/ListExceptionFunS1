


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // LIST
        // list is an interface
        // interface: a set of methods that a class can promise to implement
        // there are two classes that java provides that implement list
        // ArrayList and LinkedList
        List<String> myAutumnWords;
        // <T> is a parameterized type
        myAutumnWords = new ArrayList<>();
        // lots of great list methods available
        myAutumnWords.add("pumpkin pie");
        myAutumnWords.add("halloween");
        myAutumnWords.add("sleeping in");
        System.out.println(myAutumnWords);

//        myAutumnWords.remove(0);
//        System.out.println(myAutumnWords);

        System.out.println(myAutumnWords.size());

        // the Collections framework has lots of methods/algorithms for operating
        // on lists
        Collections.sort(myAutumnWords);
        System.out.println(myAutumnWords);
        Collections.shuffle(myAutumnWords);
        System.out.println(myAutumnWords);

        // task: create a list of the first 10 square numbers
        // int -> Integer, char -> Character, double -> Double, ...
        // converting between a primitive and its class type: autoboxing
        // print, reverse, print
        List<Integer> mySquares = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            mySquares.add(i * i);
        }
        System.out.println(mySquares);
        Collections.reverse(mySquares);
        System.out.println(mySquares);

        // we will return to this project to talk about exceptions
        // to be continued...

        // EXCEPTIONS
        // an exception is an event at runtime that disrupts the normal program execution flow
        // 2 types of exceptions in java
        // unchecked exception: runtime exception and error
        // checked exceptions: exceptions that you must anticipate, handle, and/or recover from

        // example of a runtime exception
        try {
            int x = 5 / 0; // surround this code with a try/catch block
        } catch (ArithmeticException e) {
            // if something goes wrong in the try
            // this catch will execute
            // won't crash our program
            // we should recover here
            e.printStackTrace(); // System.err
        }
        // cmd + opt + T (mac)
        // ctrl + alt + T (windows)

        // checked exception
        // (must acknowledge it)
        // try to open a file that does not exist (DNE)
        Scanner infile = null;

        try {
            infile = new Scanner(new File("dne.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // this body executes no matter what happens in the try (success or failure)
            // one use case... clean up system resources (e.g. close any files, sockets, ...)
            System.out.println("hello from finally");
        }

        /*
        Practice problem: open ListExceptionFun and run the following code:

        Task 1: Run the program. What happens if you enter “hi” as user input instead of an integer?
        Is this a checked or unchecked exception? How do you know?
        Task 2: Using a try/catch block, ensure this exception doesn’t crash your program!
        Task 3: Write an input validation loop that requires the user enters an integer.
         */
        Scanner kb = new Scanner(System.in);
        int userNum = 0;
        boolean valid = false; // assume invalid input until proven otherwise
        do {
            try {
                System.out.print("Enter an integer (or else!): ");
                userNum = kb.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not an integer!!");
            } finally {
                kb.nextLine(); // clear buffer
                // on failure: the input is still in there -> infinite loop
                // on success: the newline is still in there -> potential problems later
            }
        } while (!valid);
        System.out.println("Program execution continues...");
    }
}
