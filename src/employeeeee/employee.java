package employeeeee;

public class employee {
    private Long id;
    private String name;
    private int sal;
    public employee(long id , String name, int sal)
    {
        this.id= id;
        this.name= name;
        this.sal = sal;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;

    }
}
