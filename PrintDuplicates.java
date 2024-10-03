import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {

    public static void main(String[] args) {

         List<Integer> numbers = Arrays.asList(1,10,10,20,22,30,15);

         //Two ways

         //By using Frequency

        Set<Integer> dups = numbers
                            .stream()
                            .filter(e -> Collections.frequency(numbers, e) > 1).collect(Collectors.toSet());

        System.out.println(dups);


         //By using Hashset

         Set<Integer> dupNum = new HashSet<>();
         Set<Integer> dupList = numbers
                                .stream()
                                .filter(e -> !dupNum.add(e))
                                .collect(Collectors.toSet());

        System.out.println(dupList);

    }
    
}
