import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A3 {
    public static void main(String [] args){

        List<Integer> data = Arrays.asList(100,50006,25,542,700,20);
        List<Integer> newData = data.stream().
                filter(x->x>100).collect(Collectors.toList());
        System.out.println(newData);

    }
}
