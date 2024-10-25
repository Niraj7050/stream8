import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A5 {
    public static void main(String [] args){
        List<Integer> data =
                Arrays.asList(10,80,5574,452,50,3,27);
            List<Integer> newData =
                    data.stream().filter(t->t%2==0).
                            collect(Collectors.toList());
        System.out.println(newData);

    }
}
