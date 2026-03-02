package restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.dto.StudentDto;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(25 , "harsh" , "harsh@gmail.com");
    }
}
