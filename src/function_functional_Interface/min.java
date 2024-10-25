package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class min {
    public static void main(String [] args)
    {
        List<Integer> numbers = Arrays.asList(1,4,5,6,3,3);
        Optional<Integer> max = numbers.stream().min(Integer::compareTo);
        System.out.println(max.get());
    }
}
