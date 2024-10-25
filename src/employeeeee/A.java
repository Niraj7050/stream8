package employeeeee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String [] args)
    {
        List<employee> data = Arrays.asList(
                new employee(1,"niraj",4000),
                new employee (2,"mike", 8000),
                new employee(3,"jack",8000)
        );
        List<employee> newData = data.stream().filter(e->e.getSal()>4000).collect(Collectors.toList());
        for(employee emp:newData)
        {
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSal());;
        }
    }
}
