package top.garret.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.garret.entity.Course;
import top.garret.service.CourseService;
import top.garret.service.SystemService;
import top.garret.utils.R;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private CourseService courseService;
    private SystemService systemService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @Autowired
    public void setSystemService(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping
    public R getAll() {
        return new R(0, "查询全部课程成功", courseService.list());
    }

    @GetMapping("/{tid}")
    public R getByTid(@PathVariable Integer tid){
        return new R(0, "查询该教师教授课程成功", courseService.listByTid(tid, systemService.getSystemStatus()));
    }

    @GetMapping("/student_select")
    public R getStudentSelect() {
        if (!systemService.getSystemStatus().getOpen())
            return new R(2, "选课系统关闭", null);
        return new R(0, "查询学生可选课程成功",
                courseService.listStudentSelect(systemService.getSystemStatus()));
    }

    @GetMapping("/teacher_select")
    public R getTeacherSelect() {
        if (!systemService.getSystemStatus().getOpen())
            return new R(2, "选课系统关闭", null);
        return new R(0, "查询教师可教授课程成功",
                courseService.listTeacherSelect(systemService.getSystemStatus()));
    }

    @PostMapping
    public R save(@RequestBody Course course) {
        if (systemService.getSystemStatus().getOpen())
            return new R(2, "选课系统开启", null);
        boolean success = courseService.save(course);
        return new R(success ? 0 : 1, success ? "保存课程成功" : "保存课程失败", success ? course.getId() : null);
    }

    @PutMapping
    public R modifyById(@RequestBody Course course) {
        if (systemService.getSystemStatus().getOpen())
            return new R(2, "选课系统开启", null);
        boolean success = courseService.updateById(course);
        return new R(success ? 0 : 1, success ? "修改课程成功" : "修改课程失败", null);
    }

    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id) {
        if (systemService.getSystemStatus().getOpen())
            return new R(2, "选课系统开启", null);
        boolean success = courseService.removeById(id);
        return new R(success ? 0 : 1, success ? "删除课程成功" : "删除课程失败", null);
    }

}
