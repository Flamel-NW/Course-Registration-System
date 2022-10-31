package top.garret.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.garret.entity.Teacher;
import top.garret.mapper.TeacherMapper;
import top.garret.service.TeacherService;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
