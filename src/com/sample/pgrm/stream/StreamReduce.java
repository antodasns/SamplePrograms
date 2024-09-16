package com.sample.pgrm.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce to sum the elements
        Optional<Integer> sum = numbers.stream()
                                       .reduce((a, b) -> a + b);

        // Output the sum if present
        sum.ifPresent(System.out::println);
        
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce to find the product of all elements
        int product = numbers2.stream()
                             .reduce(1, (a, b) -> a * b);

        System.out.println(product);  
        
        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");

        // Using reduce to concatenate the strings
        Optional<String> concatenatedString = words.stream()
                                         .reduce((a, b) -> a + " " + b);

        System.out.println(concatenatedString.get().trim());
        
        List<Integer> num = Arrays.asList(3, 5, 2, 8, 6, 7);

        // Using reduce to find the maximum value
        Optional<Integer> max = num.stream()
                                       .reduce((a, b) -> a > b ? a : b);
        
        max.ifPresent(System.out::println);
        
        List<String> wordsLen = Arrays.asList("Hello", "World", "Java", "Streams");

        // Using reduce to count the total number of characters
        int totalChars = wordsLen.stream()
                              .reduce(0, (sums, word) -> sums + word.length(), Integer::sum);

        System.out.println(totalChars);  // Output: 20
    }
}
