package top.garret.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.garret.entity.TeacherToCourse;

import java.util.List;

@SpringBootTest
public class TeacherToCourseMapperTest {
    @Autowired
    private TeacherToCourseMapper teacherToCourseMapper;

    @Test
    void Test() {
        List<TeacherToCourse> teacherToCourseList = teacherToCourseMapper.selectList(null);
        System.out.println(teacherToCourseList);
        teacherToCourseMapper.deleteCancelled(3);
        teacherToCourseList = teacherToCourseMapper.selectList(null);
        System.out.println(teacherToCourseList);
    }
}
