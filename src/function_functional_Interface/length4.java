package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class length4 {
    public static void main(String [] args)
    {
        List<String> data = Arrays.asList("niraj_kumar","vicky_kumar","tom","adam");
        List<String> newData = data.stream().filter(s->s.length()>4).collect(Collectors.toList());
        System.out.println(newData);
    }
}
