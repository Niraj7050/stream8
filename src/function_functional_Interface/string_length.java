package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class string_length {
    public static void main(String[] args)
    {
        List<String> Data = Arrays.asList
                ("niraj","deepak","juli","neha");
        List<Integer> newData = Data.stream().map(x-> x.length()).collect(Collectors.toList());
        System.out.println(newData);
    }
}
