package DTOS;

public class employee {
    private Long id;
    private String name;

    public employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
