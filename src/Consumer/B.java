package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class B {
    public static void main(String [] args)
    {
        List<String> names = Arrays.asList("alice","bob","mike");
        Consumer<String> val = s-> System.out.println(s);
        names.forEach(val);
    }
}
