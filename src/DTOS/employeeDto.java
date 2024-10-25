package DTOS;

public class employeeDto {
    private Long id;
    private String name;

    public employeeDto(Long id, String name) {
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
