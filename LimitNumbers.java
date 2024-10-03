import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,10,20,22,30,15,33,5,7,77);


        //limit first 5 elements

       List <Integer> nums =  numbers
                                .stream()
                                .limit(5)
                                .collect(Collectors.toList());

        System.out.println(nums);

        int sum = numbers
                  .stream()
                  .limit(5)
                  .reduce((a,b) -> (a+b))
                  .get();

        System.out.println(sum);

        //skip first 5 elements

        List<Integer> nos = numbers
                            .stream()
                            .skip(5)
                            .collect(Collectors.toList());

        System.out.println(nos);

        int sums = numbers
                  .stream()
                  .skip(5)
                  .reduce((a,b) -> (a+b))
                  .get();

        System.out.println(sums);

    }
    
}
