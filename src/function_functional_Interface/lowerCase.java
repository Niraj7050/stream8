package function_functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lowerCase
{
    public static void main(String [] args){
        List<String> data = Arrays.asList
                ("MIKE","SAURAV","ROHIT","MUSO");
        List<String> newData = data.stream().map(e->
                e.toLowerCase()).collect(Collectors.toList());
        System.out.println(newData);
    }
}
