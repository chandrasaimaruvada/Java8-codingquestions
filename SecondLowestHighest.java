import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighest {

    public static void main(String[] args) {
         List<Integer> numbers = Arrays.asList(1,10,20,22,30,15,33,5,7,77);

         int secH = numbers
                    .stream()
                    .sorted(Collections.reverseOrder())
                    .distinct()
                    .skip(1)
                    .findFirst()
                    .get();

        System.out.println(secH);

        int secL = numbers
                    .stream()
                    .sorted()
                    .distinct()
                    .skip(1)
                    .findFirst()
                    .get();
        
        System.out.println(secL);
    }
    
}
