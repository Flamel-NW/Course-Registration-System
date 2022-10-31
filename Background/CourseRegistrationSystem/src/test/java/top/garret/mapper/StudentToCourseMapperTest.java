package top.garret.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.garret.entity.StudentToCourse;
import top.garret.mapper.StudentToCourseMapper;

import java.util.List;

@SpringBootTest
public class StudentToCourseMapperTest {
    @Autowired
    private StudentToCourseMapper studentToCourseMapper;

    @Test
    void Test() {
        List<StudentToCourse> studentToCourseList = studentToCourseMapper.selectList(null);
        System.out.println(studentToCourseList);
        studentToCourseMapper.deleteCancelled(3);
        studentToCourseList = studentToCourseMapper.selectList(null);
        System.out.println(studentToCourseList);
    }
}
