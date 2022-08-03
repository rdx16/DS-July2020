package net.bench.resources.sort.linkedlist.java;
 
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
 
public class SortLinkedListOfIntegerUsingCollectionsSortMethod {
 
    public static void main(String[] args) {
 
        // 1. create LinkedList
        List<Integer> numbers = new LinkedList<>();
 
 
        // 1.2 add integer numbers to LL
        numbers.add(87);
        numbers.add(18);
        numbers.add(98);
        numbers.add(64);
        numbers.add(25);
        numbers.add(77);
        numbers.add(54);
 
 
        // 1.3 original LinkedList in insertion order
        System.out.println("1. Original LinkedList<Integer> "
                + "as per insertion-order :- \n");
 
 
        // 1.4 Iterating using enhanced for-loop
        for(int num : numbers){
            System.out.println(num);
        }
 
 
        // 2. Collections.sort() - natural order
        Collections.sort(numbers);
 
 
        // 2.1 print to console
        System.out.println("\n2. Natural order of "
                + "LinkedList<Integer> :- \n");
 
 
        // 2.2 Iterating using enhanced for-loop
        for(int num : numbers){
            System.out.println(num);
        }
 
 
        // 3. Collections.sort() - reverse order
        Collections.sort(numbers, Comparator.reverseOrder());
 
 
        // 3.1 print to console
        System.out.println("\n3. Reverse order of "
                + "LinkedList<Integer> :- \n");
 
 
        // 3.2 Iterating using enhanced for-loop
        for(int num : numbers){
            System.out.println(num);
        }
    }
}