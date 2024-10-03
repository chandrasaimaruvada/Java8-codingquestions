import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenOdd {

    public static void main(String[] args) {
        
         List<Integer> numbers = Arrays.asList(1,10,20,30,15);

         List <Integer> OddNumbers = numbers
                        .stream()
                        .filter(e -> e % 2 != 0)
                        .collect(Collectors.toList());

        System.out.println(OddNumbers);

        List <Integer> EvenNumbers = numbers
                                    .stream()
                                    .filter(e -> e % 2 == 0)
                                    .collect(Collectors.toList());

        System.out.println(EvenNumbers);
        
    }
    
}
