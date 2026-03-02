package restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor // Create an constructor for all values
public class StudentDto {
    private long id;
    private String name;
    private String email;

    public StudentDto(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
