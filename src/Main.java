


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    }
}
