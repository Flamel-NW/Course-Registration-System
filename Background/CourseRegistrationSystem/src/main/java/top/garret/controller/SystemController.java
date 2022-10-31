package top.garret.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.garret.entity.Course;
import top.garret.entity.StudentToCourse;
import top.garret.entity.TeacherToCourse;
import top.garret.service.CourseService;
import top.garret.service.StudentToCourseService;
import top.garret.service.SystemService;
import top.garret.service.TeacherToCourseService;
import top.garret.utils.R;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class SystemController {
    private SystemService systemService;
    private CourseService courseService;
    private StudentToCourseService studentToCourseService;
    private TeacherToCourseService teacherToCourseService;

    @Autowired
    public void setSystemService(SystemService systemService) {
        this.systemService = systemService;
    }

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @Autowired
    public void setStudentToCourseService(StudentToCourseService studentToCourseService) {
        this.studentToCourseService = studentToCourseService;
    }

    @Autowired
    public void setTeacherToCourseService(TeacherToCourseService teacherToCourseService) {
        this.teacherToCourseService = teacherToCourseService;
    }

    @GetMapping("/status")
    public R getStatus() {
        return new R(0, "选课系统状态", systemService.getSystemStatus());
    }

    @GetMapping("/begin")
    public R registrationBegin() {
        boolean success = systemService.registrationBegin();
        return new R(success ? 0 : 1, success ? "选课开始" : "选课已开始",
                success ? systemService.getSystemStatus() : null);
    }

    @GetMapping("/end")
    public R registrationEnd() {
        boolean success = systemService.registrationEnd();
        return new R(success ? 0 : 1, success ? "选课结束" : "选课已结束",
                success ? systemService.getSystemStatus() : null);
    }

    @GetMapping("/transcripts/{sid}")
    public R getTranscripts(@PathVariable Integer sid) {
        return new R(0, "查询该学生课程列表成功", systemService.listTranscripts(sid));
    }

    @PostMapping("/student_to_course")
    public R saveStudentToCourse(@RequestBody StudentToCourse studentToCourse) {
        List<Course> courseList = courseService.listBySid(studentToCourse.getSid(), systemService.getSystemStatus());
        Course course = courseService.getById(studentToCourse.getCid());
        if (courseConflict(courseList, course))
            return new R(3, "学生选课冲突", null);
        boolean success = studentToCourseService.save(studentToCourse);
        return new R(success ? 0 : 1, success ? "学生选课成功" : "学生选课失败", null);
    }

    @PutMapping("/student_to_course")
    public R modifyTeacherToCourse(@RequestBody StudentToCourse studentToCourse) {
        UpdateWrapper<StudentToCourse> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("cid", studentToCourse.getCid())
                .eq("sid", studentToCourse.getSid())
                .set("score", studentToCourse.getScore());
        boolean success = studentToCourseService.update(updateWrapper);
        return new R(success ? 0 : 1, success ? "登记成绩成功" : "登记成绩失败", null);
    }

    @PostMapping("/teacher_to_course")
    public R saveTeacherToCourse(@RequestBody TeacherToCourse teacherToCourse) {
        List<Course> courseList = courseService.listByTid(teacherToCourse.getTid(), systemService.getSystemStatus());
        Course course = courseService.getById(teacherToCourse.getCid());
        if (courseConflict(courseList, course))
            return new R(3, "教师选课冲突", null);
        boolean success = teacherToCourseService.save(teacherToCourse);
        return new R(success ? 0 : 1, success ? "教师选课成功" : "教师选课失败", null);
    }

    private boolean courseConflict(List<Course> courseList, Course target) {
        for (Course course : courseList)
            if (Objects.equals(course.getDay(), target.getDay()) &&
                    Objects.equals(course.getLesson(), target.getLesson()))
                return true;
        return false;
    }
}
