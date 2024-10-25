package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upper_case {
    public static void main(String [] args)
    {
        List<String> Data = Arrays.asList
                ("niraj","saurav","vicky","shrisha");
        List<String> newData = Data.stream().
                map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(newData);

    }
}
