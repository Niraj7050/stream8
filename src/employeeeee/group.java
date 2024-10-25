package employeeeee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class group {
    public static void main(String [] args)
    {
        List<employee> data = Arrays.asList(
                new employee(1,"niraj",5000),
                new employee(2,"mike",5000),
                new employee(3,"rahul",4000),
                new employee(4,"com",4000),
                new employee(5,"vicky",3000)
        );
        Map<Integer ,List<employee>> newData = data.stream().collect(Collectors.groupingBy(e->e.getSal()));
        System.out.println(newData);

    }
}
