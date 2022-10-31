package top.garret.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.garret.entity.Teacher;
import top.garret.entity.controller.LoginInfo;
import top.garret.utils.R;
import top.garret.service.TeacherService;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    private TeacherService teacherService;

    @Autowired
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public R getAll() {
        return new R(0, "查询所有教师成功", teacherService.list());
    }

    @PostMapping("/login")
    public R login(@RequestBody LoginInfo loginInfo) {
        Teacher teacher = teacherService.getById(loginInfo.getId());
        boolean success = teacher != null && teacher.getPassword().equals(loginInfo.getPassword());
        return new R(success ? 0 : 1, success ? "登录成功" : "登录失败", success ? teacher : null);
    }

    @PostMapping
    public R save(@RequestBody Teacher teacher) {
        boolean success = teacherService.save(teacher);
        return new R(success ? 0 : 1, success ? "保存教师成功" : "保存教师失败", success ? teacher.getId() : null);
    }

    @PutMapping
    public R modifyById(@RequestBody Teacher teacher) {
        boolean success = teacherService.updateById(teacher);
        return new R(success ? 0 : 1, success ? "修改教师成功" : "修改教师失败", null);
    }

    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id) {
        boolean success = teacherService.removeById(id);
        return new R(success ? 0 : 1, success ? "删除教师成功" : "删除教师失败", null);
    }
}
