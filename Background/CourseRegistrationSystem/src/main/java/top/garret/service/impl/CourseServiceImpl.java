package top.garret.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.garret.entity.Course;
import top.garret.mapper.CourseMapper;
import top.garret.service.CourseService;
import top.garret.utils.SystemStatus;

import java.util.List;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
    private CourseMapper courseMapper;

    @Autowired
    public void setCourseMapper(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Override
    public List<Course> listStudentSelect(SystemStatus systemStatus) {
        return courseMapper.selectStudentSelect(systemStatus);
    }

    @Override
    public List<Course> listTeacherSelect(SystemStatus systemStatus) {
        return courseMapper.selectTeacherSelect(systemStatus);
    }

    @Override
    public List<Course> listByTid(Integer tid, SystemStatus systemStatus) {
        return courseMapper.selectByTid(tid, systemStatus);
    }

    @Override
    public List<Course> listBySid(Integer sid, SystemStatus systemStatus) {
        return courseMapper.selectBySid(sid, systemStatus);
    }
}
