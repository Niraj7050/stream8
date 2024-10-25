package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class shorted {
    public static void main(String [] args)
    {
        List<String> Data = Arrays.asList("niraj_kumar","muso", "annya");
        List<String> newData = Data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}
