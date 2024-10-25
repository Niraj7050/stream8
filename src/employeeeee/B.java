package employeeeee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String [] args)
    {
        List<employee> data = Arrays.asList(
                new employee(1,"mike",5000),
                new employee(2,"muso_@",25045),
                new employee (3,"Harsh",1000)
        );
        List<employee> newData = data.stream().filter(e->e.getName().startsWith("m")).collect(Collectors.toList());
        System.out.println(newData);
        for(employee emp:newData)
        {
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSal());
        }
    }
}
