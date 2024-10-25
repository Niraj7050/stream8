package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class add5 {
    public static void main(String [] args){
        List<Integer> Data = Arrays.asList(10,20,30,40);
        List<Integer> newData = Data.stream().map(x->x+5).collect(Collectors.toList());
        System.out.println(newData);
    }
}
