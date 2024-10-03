import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscDesc {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,10,20,22,30,15);

        List<Integer> sortedNumList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumList);

        List<Integer> sortedNumListDesc = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedNumListDesc);
                
    }
    
}
