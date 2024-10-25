package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squqre_Arrays {
    public static void main(String [] args)
    {
        List<Integer> Data = Arrays.asList(10,210,20);
        List<Integer> newData = Data.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(newData);
    }
}
