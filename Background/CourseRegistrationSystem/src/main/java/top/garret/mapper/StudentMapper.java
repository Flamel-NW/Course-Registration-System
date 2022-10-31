package top.garret.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.garret.entity.Student;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    @Select("SELECT * " +
            "FROM tb_student INNER JOIN tb_student_to_course ON tb_student.id = tb_student_to_course.sid " +
            "WHERE cid = #{cid} AND score IS NULL;")
    List<Student> selectByCid(Integer cid);
}
