package Consumer;

import java.util.function.Consumer;

public class A {
    public static void main(String [] args)
    {
        Consumer<String> x = s-> System.out.println(s);
        x.accept("mike");
    }
}
