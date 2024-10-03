import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintMinMax {

    public static void main(String[] args) {
        
         List<Integer> numbers = Arrays.asList(1,10,20,22,30,15);

         int max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();

         int min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();

         System.out.println(max);
         System.out.println(min);
    }
    
}
