package top.garret.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.garret.entity.StudentToCourse;
import top.garret.mapper.StudentToCourseMapper;
import top.garret.service.StudentToCourseService;

@Service
public class StudentToCourseServiceImpl
        extends ServiceImpl<StudentToCourseMapper, StudentToCourse>
        implements StudentToCourseService {
}
