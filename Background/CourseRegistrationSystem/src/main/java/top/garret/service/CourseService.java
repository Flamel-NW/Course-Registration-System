package top.garret.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.garret.entity.Course;
import top.garret.utils.SystemStatus;

import java.util.List;

public interface CourseService extends IService<Course> {
    List<Course> listStudentSelect(SystemStatus systemStatus);
    List<Course> listTeacherSelect(SystemStatus systemStatus);
    List<Course> listByTid(Integer tid, SystemStatus systemStatus);
    List<Course> listBySid(Integer sid, SystemStatus systemStatus);
}
