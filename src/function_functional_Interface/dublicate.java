package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dublicate {
    public static void main(String [] args)
    {
        List<String> data = Arrays.asList("mike","mike","niraj","tom","tom");
        List<String> newData = data.stream().distinct().collect(Collectors.toList());
        System.out.println(newData);
    }
}
