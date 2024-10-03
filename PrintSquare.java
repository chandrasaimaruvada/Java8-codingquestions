import java.util.Arrays;
import java.util.List;

public class PrintSquare{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,10,20,30,15);



       double avg = 
                            numbers
                            .stream()
                            .map(x -> x*x)
                            .filter(e -> e > 100)
                            .mapToInt(e -> e).average().getAsDouble();
                            

        System.out.println(avg);
    }
}