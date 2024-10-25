package function_functional_Interface;

import java.util.function.Function;

public class length {

    public static void main(String []args){
        Function<String, Integer> x= s->s.length();
        Integer val = x.apply("mike");
        System.out.println(val);
    }
}
