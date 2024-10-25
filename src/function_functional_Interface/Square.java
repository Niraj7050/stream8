package function_functional_Interface;

import java.util.function.Function;

public class Square {
    public static void main(String [] args)
    {
        Function<Integer, Integer> x = s-> s*s;
        Integer val = x.apply(20);
        System.out.println(val);
    }
}
