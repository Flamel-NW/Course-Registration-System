package top.garret.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.garret.entity.Student;

import java.util.List;

@SpringBootTest
public class studentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void Test() {
        List<Student> studentList = studentMapper.selectByCid(1);
        System.out.println(studentList);
    }
}
