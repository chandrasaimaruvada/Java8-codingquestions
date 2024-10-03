import java.util.Arrays;
import java.util.List;

public class PrintAverage {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //we can use average function on Integers only, that's why converted to mapToInt

        double avg  = numbers.stream().mapToInt(e -> e).average().getAsDouble();

        System.out.println("Average is : " + avg);
    }
    
}
