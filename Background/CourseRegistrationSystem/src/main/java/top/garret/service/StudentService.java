package top.garret.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.garret.entity.Student;

import java.util.List;

public interface StudentService extends IService<Student> {
    List<Student> listByCid(Integer cid);
}
