package top.garret.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.garret.service.StudentToCourseService;

@SpringBootTest
public class StudentToCourseServiceTest {
    private StudentToCourseService studentToCourseService;

    @Autowired
    public void setStudentToCourseService(StudentToCourseService studentToCourseService) {
        this.studentToCourseService = studentToCourseService;
    }

}
