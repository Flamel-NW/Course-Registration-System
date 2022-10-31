package top.garret.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.garret.entity.TeacherToCourse;
import top.garret.mapper.TeacherToCourseMapper;
import top.garret.service.TeacherToCourseService;

@Service
public class TeacherToCourseServiceImpl
        extends ServiceImpl<TeacherToCourseMapper, TeacherToCourse>
        implements TeacherToCourseService {
}
