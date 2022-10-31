package top.garret.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import top.garret.entity.StudentToCourse;

@Mapper
public interface StudentToCourseMapper extends BaseMapper<StudentToCourse> {
    @Delete("WITH tb_cid AS (" +
                "SELECT cid, COUNT(*) AS cnt " +
                "FROM tb_student_to_course " +
                "GROUP BY cid " +
                "HAVING cnt >= #{lowerBound}" +
            ")" +
            "DELETE FROM tb_student_to_course " +
            "WHERE cid NOT IN (" +
                "SELECT tb_cid.cid  " +
                "FROM tb_cid INNER JOIN tb_teacher_to_course ON tb_cid.cid = tb_teacher_to_course.cid" +
            ");")
    int deleteCancelled(Integer lowerBound);
}
