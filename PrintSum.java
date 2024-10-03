import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSum{
    
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,4,5,61);

        Optional<Integer> sum = numbers
                                .stream()
                                .reduce((a,b) -> (a+b));

        System.out.println(sum);
        
    }
}