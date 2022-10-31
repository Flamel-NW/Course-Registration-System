package top.garret.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.garret.entity.Course;
import top.garret.service.SystemService;

import java.util.List;

@SpringBootTest
public class CourseMapperTest {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private SystemService systemService;

    @Test
    void Test() {
        List<Course> courseList = courseMapper.selectStudentSelect(systemService.getSystemStatus());
        System.out.println(courseList);
        courseList = courseMapper.selectTeacherSelect(systemService.getSystemStatus());
        System.out.println(courseList);
        courseList = courseMapper.selectByTid(4, systemService.getSystemStatus());
        System.out.println(courseList);
    }
}
