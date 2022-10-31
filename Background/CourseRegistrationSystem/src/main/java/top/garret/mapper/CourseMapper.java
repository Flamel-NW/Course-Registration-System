package top.garret.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.garret.entity.Course;
import top.garret.utils.SystemStatus;

import java.util.List;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {
    @Select("SELECT * " +
            "FROM tb_course " +
            "WHERE id NOT IN (" +
                    "SELECT cid " +
                    "FROM tb_student_to_course " +
                    "GROUP BY cid " +
                    "HAVING COUNT(*) >= 9" +
                ") AND year = #{year} AND semester = #{semester};")
    List<Course> selectStudentSelect(SystemStatus systemStatus);

    @Select("SELECT * " +
            "FROM tb_course LEFT JOIN tb_teacher_to_course ON tb_course.id = tb_teacher_to_course.cid " +
            "WHERE tb_teacher_to_course.cid IS NULL AND year = #{year} AND semester = #{semester};")
    List<Course> selectTeacherSelect(SystemStatus systemStatus);

    @Select("SELECT * " +
            "FROM tb_course INNER JOIN tb_teacher_to_course ON tb_course.id = tb_teacher_to_course.cid " +
            "WHERE tid = #{tid} AND year = #{systemStatus.year} AND semester = #{systemStatus.semester};")
    List<Course> selectByTid(Integer tid, SystemStatus systemStatus);

    @Select("SELECT * " +
            "FROM tb_course INNER JOIN tb_student_to_course ON tb_course.id = tb_student_to_course.cid " +
            "WHERE sid = #{sid} AND year = #{systemStatus.year} AND semester = #{systemStatus.semester};")
    List<Course> selectBySid(Integer sid, SystemStatus systemStatus);
}
