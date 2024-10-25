import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A4 {
    public static void main(String [] args){
        List<String> data = Arrays.asList
                ("mike", "adam","bike","me","niraj");
        List<String> newData = data.stream().
                filter(x->x.startsWith("n"))
                .collect(Collectors.toList());
        System.out.println(newData);
    }
}
