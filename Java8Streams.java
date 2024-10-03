import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Optional;
import java.util.Comparator;
import java.util.function.*;
import java.util.LinkedHashMap;
public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,2,2,3,4,5,20,18,18,23,465,78,24,11,56,55,57,89);

        //Find the first occurance of the list

        nums.stream().findFirst().ifPresent(System.out::println);

        //Find the total no of elements present in the list
        System.out.println(nums.stream().count());

        //print the numbers starting with 5 using streams

        List<Integer> startsWith5 =  nums.stream()
                                    .map(String::valueOf)
                                    .filter(e -> e.startsWith("5"))
                                    .map(Integer::valueOf)
                                    .collect(Collectors.toList());
        
        System.out.println(startsWith5);

        //find the duplicate elements in the list

        Set<Integer>  dups  = nums
                                .stream()
                                .filter(e -> Collections.frequency(nums,e) > 1).collect(Collectors.toSet());
        System.out.println(dups);


        Set<Integer> dupsList = new HashSet<>();


        Set<Integer> output =    nums
                                .stream()
                                .filter(e -> !dupsList.add(e))
                                .collect(Collectors.toSet());

        System.out.println(output);

        //find the mini and max values in the list using stream

        int max = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min = nums.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);


        //sort all the values in the list

        List<Integer> sortedEle = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedEle);

        //sorted all the values in descending order

        List<Integer> sortedDesc = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDesc);

        //to perform square of a given list which are greater than 50

        List<Integer> squaIntegers = nums
                                    .stream()
                                    .map(e -> e * 2)
                                    .filter(e -> e < 50)
                                    .collect(Collectors.toList());

        System.out.println(squaIntegers);


        //To convert words into uppercase by using map

        List<String> words = Arrays.asList("sai","sai","josh","Chandra","aboli","josh");

        List<String> uppercase  = words.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercase);


        //Second Maximum element in array

        int secHighest =         nums
                                .stream()
                                .sorted()
                                .distinct()
                                .skip(1)
                                .findFirst()
                                .get();
            System.out.println("Second Highest : " + secHighest);


            //How to check if the list in Java 8 is empty using optional, if not null iterate through the list and print object
            
            List<String> list = null;

            Optional<List<String>> optionalList = Optional.ofNullable(list);

            optionalList.ifPresentOrElse(i -> i.stream().forEach(System.out::println), () -> System.out.println("the list is empty"));

            //determine the number of occurances count

            int value = 2;

            double res  = nums
                          .stream()
                          .filter(v -> v == value).count();
            
            System.out.println(res);


            //How to find only duplicate elements and how many times count

            Map<String,Long> map = words.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

            map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(m -> System.out.println(m.getKey() + ":" + m.getValue()));


            //count the characters in a given word

            String word = "cchandrasai";

            Map<Character,Long> charcterCount = word.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            System.out.println(charcterCount);


            //Find the first non repeated character in a string

            Character result = word.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
            Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey).findFirst().orElse(null);

            System.out.println(result);

    }
}