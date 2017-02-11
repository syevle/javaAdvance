package javaPractice.java8.venkat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> dublicateNumbers = Arrays.asList(1,1, 2,2,2, 3, 4, 5, 6, 7, 8, 9, 10);


        // Find Duplicate numbers.
        Integer[] numbers1 = new Integer[] { 1, 2, 1, 3, 4, 4 };
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers1)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
