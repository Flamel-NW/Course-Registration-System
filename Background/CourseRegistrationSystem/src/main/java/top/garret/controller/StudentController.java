package top.garret.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.garret.entity.controller.LoginInfo;
import top.garret.entity.Student;
import top.garret.service.StudentService;
import top.garret.utils.R;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public R getAll() {
        return new R(0, "查询全部学生成功", studentService.list());
    }

    @GetMapping("/{cid}")
    public R getStudentByCid(@PathVariable Integer cid) {
        return new R(0, "查询该课程学生成功", studentService.listByCid(cid));
    }

    @PostMapping("/login")
    public R login(@RequestBody LoginInfo loginInfo) {
        Student student = studentService.getById(loginInfo.getId());
        boolean success = student != null && student.getPassword().equals(loginInfo.getPassword());
        return new R(success ? 0 : 1, success ? "登录成功" : "登录失败", success ? student : null);
    }

    @PostMapping
    public R save(@RequestBody Student student) {
        boolean success = studentService.save(student);
        return new R(success ? 0 : 1, success ? "保存学生成功" : "保存学生失败", success ? student.getId() : null);
    }

    @PutMapping
    public R modifyById(@RequestBody Student student) {
        boolean success = studentService.updateById(student);
        return new R(success ? 0 : 1, success ? "修改学生成功" : "修改学生失败", null);
    }

    @DeleteMapping("/{id}")
    public R removeById(@PathVariable Integer id) {
        boolean success = studentService.removeById(id);
        return new R(success ? 0 : 1, success ? "删除学生成功" : "删除学生失败", null);
    }

}
