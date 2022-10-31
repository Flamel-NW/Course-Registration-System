package top.garret.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import top.garret.entity.TeacherToCourse;

@Mapper
public interface TeacherToCourseMapper extends BaseMapper<TeacherToCourse> {
    @Delete("DELETE FROM tb_teacher_to_course " +
            "WHERE cid NOT IN (" +
                "SELECT cid " +
                "FROM tb_student_to_course " +
                "GROUP BY cid " +
                "HAVING COUNT(*) >= #{lowerBound}" +
            ");")
    int deleteCancelled(Integer lowerBound);
}
