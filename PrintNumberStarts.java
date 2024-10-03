import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumberStarts {

    public static void main(String[] args) {
        
         List<Integer> numbers = Arrays.asList(1,10,20,22,30,15);

        List<Integer> startsWith2 =  numbers
                                    .stream()
                                    .map(e -> String.valueOf(e))
                                    .filter(e -> e.startsWith("2"))
                                    .map(Integer::valueOf)
                                    .collect(Collectors.toList());

        System.out.println(startsWith2);
    }
    
}
