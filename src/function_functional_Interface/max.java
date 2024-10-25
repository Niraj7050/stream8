package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class max {
    public static void main(String [] args)
    {
        List<Integer> numbers = Arrays.asList
                (20,414,528,520,10);
        Optional<Integer> max =
                numbers.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
