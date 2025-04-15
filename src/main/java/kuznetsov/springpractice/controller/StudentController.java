package kuznetsov.springpractice.controller;

import kuznetsov.springpractice.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().firstName("Олег").email("oleg123@mail.ru").age(41).build(),
                Student.builder().firstName("Вася").email("vasya123@mail.ru").age(35).build(),
                Student.builder().firstName("Коля").email("kolya123@mail.ru").age(20).build()
        );
    }
}
