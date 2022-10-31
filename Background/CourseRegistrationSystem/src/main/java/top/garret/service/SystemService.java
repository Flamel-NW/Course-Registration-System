package top.garret.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.garret.entity.StudentToCourse;
import top.garret.entity.TeacherToCourse;
import top.garret.entity.Transcript;
import top.garret.mapper.CourseMapper;
import top.garret.mapper.StudentToCourseMapper;
import top.garret.mapper.TeacherMapper;
import top.garret.mapper.TeacherToCourseMapper;
import top.garret.utils.SystemStatus;

import java.util.ArrayList;
import java.util.List;

@Service
public class SystemService {
    private final SystemStatus systemStatus = new SystemStatus();

    private CourseMapper courseMapper;
    private TeacherMapper teacherMapper;
    private StudentToCourseMapper studentToCourseMapper;
    private TeacherToCourseMapper teacherToCourseMapper;

    @Autowired
    public void setCourseMapper(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Autowired
    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Autowired
    public void setStudentToCourseMapper(StudentToCourseMapper studentToCourseMapper) {
        this.studentToCourseMapper = studentToCourseMapper;
    }

    @Autowired
    public void setTeacherToCourseMapper(TeacherToCourseMapper teacherToCourseMapper) {
        this.teacherToCourseMapper = teacherToCourseMapper;
    }

    public SystemStatus getSystemStatus() {
        return systemStatus;
    }

    public boolean registrationBegin() {
        boolean success = systemStatus.flip(true);
        if (success) {
            studentToCourseMapper.delete(null);
            teacherToCourseMapper.delete(null);
        }
        return success;
    }

    public boolean registrationEnd() {
        boolean success = systemStatus.flip(false);
        if (success) {
            studentToCourseMapper.deleteCancelled(3);
            teacherToCourseMapper.deleteCancelled(3);
        }
        return success;
    }

    public List<Transcript> listTranscripts(Integer sid) {
        LambdaQueryWrapper<StudentToCourse> studentToCourseLambdaQueryWrapper = new LambdaQueryWrapper<>();
        studentToCourseLambdaQueryWrapper.eq(StudentToCourse::getSid, sid);
        List<StudentToCourse> studentToCourseList = studentToCourseMapper.selectList(studentToCourseLambdaQueryWrapper);
        List<Transcript> transcripts = new ArrayList<>();

        for (StudentToCourse studentToCourse : studentToCourseList) {
            Transcript transcript = new Transcript();
            transcript.setStudentToCourse(studentToCourse);
            transcript.setCourse(courseMapper.selectById(studentToCourse.getCid()));

            LambdaQueryWrapper<TeacherToCourse> teacherToCourseLambdaQueryWrapper = new LambdaQueryWrapper<>();
            teacherToCourseLambdaQueryWrapper.eq(TeacherToCourse::getCid, studentToCourse.getCid());
            TeacherToCourse teacherToCourse = teacherToCourseMapper.selectOne(teacherToCourseLambdaQueryWrapper);

            if (teacherToCourse != null)
                transcript.setTeacher(teacherMapper.selectById(teacherToCourse.getTid()));

            transcripts.add(transcript);
        }

        while (transcripts.size() > 4) {
            for (Transcript transcript : transcripts) {
                if (!transcript.getCourse().getRequired()) {
                    transcripts.remove(transcript);
                    break;
                }
            }
        }


        return transcripts;
    }
}
