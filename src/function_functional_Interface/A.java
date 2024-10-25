package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A
{
    public static void main(String [] args)
{
    List<String> data = Arrays.asList("mike","tom","niraj","chandan","juli");
    List<String> newData = data.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
    System.out.println(newData);
}
}
