import java.util.function.Predicate;

public class A2 {
    public static void main(String [] args){
        Predicate<String> val = x -> x.equals("mike");
        boolean result = val.test("mike");
        System.out.println(result);
    }
}
