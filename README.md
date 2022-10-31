# Course Registration System
吉林大学2019级软件工程课设

## 接口文档

- 服务器返回信息格式
```javascript
R: {
    "code": , // 0 成功;
    "msg": ,
    "data": {

    }
}
```

---

- 登录
```javascript
POST /api/students/login:  
    req: {
        id: number,
        password: string,
    }
    rsp: {
        R.data: { Student }, // 成功则返回数据，失败返回错误状态码
    }
POST /api/teachers/login: 
    req: {
        id: number,
        password: string,
    }
    rsp: {
        R.data: { Teacher }, // 成功则返回数据，失败返回错误状态码
    }
```

- 获取系统状态
```javascript
GET /api/status: 
    rsp: {
        R.data: {
            year: number,
            semester: number,   // 1为上半学期，2为下半学期
            open: bool,         // 是否开放选课
        }
    }
```

- 选课开始/结束
```javascript
GET /api/begin: 
    rsp: {
        // 成功则为以下数据，失败则为null
        R.data: {
            year: number,
            semester: number,   // 1为上半学期，2为下半学期
            open: bool,         // 是否开放选课
        }
    }
GET /api/end: 
    rsp: {
        // 成功则为以下数据，失败则为null
        R.data: {
            year: number,
            semester: number,   // 1为上半学期，2为下半学期
            open: bool,         // 是否开放选课
        }
    }
```

- 查询某学生成绩单
```javascript
GET /api/transcripts/{sid}:  
    rsp: {
        R.data: {[
            {
                studentToCourse: StudentToCourse,
                course: Course,
                teacher: Teacher
            }
        ]}
    }
```

- 学生选课
```javascript
POST /api/student_to_course:  
    req: {
        sid: number,
        cid: number
    }
    rsp: {
        R
    }
```

- 登记成绩
```javascript
PUT /api/student_to_course:  
    req: {
        sid: number,
        cid: number,
        score: number
    }
    rsp: {
        R
    }
```

- 教师选课
```javascript
POST /api/teacher_to_course:  
    req: {
        tid: number,
        cid: number
    }
    rsp: {
        R
    }
```

- 查询选了某课程的学生
```javascript
GET /api/students/{cid}: 
    rsp: {
        R.data: { [Students] }
    }
```

- 查询所有学生
```javascript
GET /api/students: 
    rsp: {
        R.data: { [Students] }
    }
```

- 新建学生
```javascript
POST /api/students: 
    req: {
        name: string,
        department: string,
        sex: bool,
        password: string,
        phoneNumber: string,
        birthDate: string,
        graduationDate: string,
    }
    rsp: {
        R.data: { id: number },
    }
```

- 更新学生
```javascript
PUT /api/students: 
    req: {
        id: number,
        name: string,
        department: string,
        sex: bool,
        password: string,
        phoneNumber: string,
        birthDate: string,
        graduationDate: string,
    }
    rsp: {
        R
    }
```

- 删除学生
```javascript
DELETE /api/students/{id}: 
    rsp: {
        R
    }
```

- 查询所有老师
```javascript
GET /api/teachers: 
    rsp: {
        R.data: { [Teachers] }
    }
```

- 新建老师
```javascript
POST /api/teachers: 
    req: {
        name: string,
        department: string,
        sex: bool,
        password: string,
        phoneNumber: string,
        birthDate: string,
        salary: number,
    }
    rsp: {
        R.data: { id: number }
    }
```

- 更新老师
```javascript
PUT /api/teachers: 
    req: {
        id: number,
        name: string,
        department: string,
        sex: bool,
        password: string,
        phoneNumber: string,
        birthDate: string,
        salary: number,
    }
    rsp: {
        R
    }
```

- 删除老师
```javascript
DELETE /api/teachers/{id}: 
    rsp: {
        R
    }
```

- 查询学生可选课程
```javascript
GET /api/courses/student_select:  
    rsp: {
        R.data: { [Courses] }
    }
```

- 查询教师可选课程
```javascript
GET /api/courses/teacher_select: 
    rsp: {
        R.data: { [Courses] }
    }
```

- 查询某教师可打分课程
```javascript
GET /api/courses/{tid}: 
    rsp: {
        R.data: { [Courses] }
    }
```

- 查询所有课程
```javascript
GET /api/courses: 
    rsp: {
        R.data: { [Courses] }
    }
```

- 新建课程
```javascript
POST /api/courses: 
    req: {
        name: string,
        department: string,
        credit: number,
        required: bool,

        year: number,
        semester: number,           // 1为上半学期，2为下半学期
        day: number,                // 0为星期日
        lesson: number               // 1-4为每天第几节课
        // 以下同理
    }
    rsp: {
        R.data: { id: number }
    }
```

- 更新课程
```javascript
PUT /api/courses: 
    req: {
        id: number
        name: string,
        department: string,
        credit: number,
        required: bool,

        year: number,
        semester: number,
        day: number,
        lesson number
    }
    rsp: {
        R
    }
```

- 删除课程
```javascript
DELETE /api/courses/{id}: 
    rsp: {
        R
    }
```

---

- 数据库表项参考
```SQL
CREATE TABLE tb_student(
    id INT AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    password VARCHAR(32) NOT NULL,
    department VARCHAR(32) NOT NULL,
    sex INT NOT NULL,
    phone_number VARCHAR(32) NOT NULL,
    birth_date VARCHAR(32) NOT NULL,
    graduation_date VARCHAR(32) NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_teacher(
    id INT AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL, 
    password VARCHAR(32) NOT NULL,
    department VARCHAR(32) NOT NULL,
    sex INT NOT NULL,
    phone_number VARCHAR(32) NOT NULL,
    birth_date VARCHAR(32) NOT NULL,
    salary INT NOT NULL,
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_course(
    id INT AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    department VARCHAR(32) NOT NULL,
    credit INT NOT NULL,
    required INT NOT NULL,
    
    year INT NOT NULL,
    semester INT NOT NULL,                      -- 1为上半学期，2为下半学期
    day INT NOT NULL,                           -- 0为星期日
    lesson INT NOT NULL,                        -- 1-4为每天第几节课
    
    PRIMARY KEY(id)
);

CREATE TABLE tb_student_to_course(
    sid INT,
    cid INT,
    score INT,
    
    PRIMARY KEY(sid, cid),
    FOREIGN KEY(sid) REFERENCES tb_student(id),
    FOREIGN KEY(cid) REFERENCES tb_course(id)
);

CREATE TABLE tb_teacher_to_course(
    tid INT NOT NULL,
    cid INT,
    
    PRIMARY KEY(cid),
    FOREIGN KEY(tid) REFERENCES tb_teacher(id),
    FOREIGN KEY(cid) REFERENCES tb_course(id)
);
```
---
### 更新日志

- 0.1.2: 修改查询学生、教师可选课程接口

- 0.1.1: 修改成绩单接口

- 0.1.0: 修改成绩单接口，修改sql

- 0.0.9: 增加查询某学生成绩单接口，删除查询某学生已选课程接口，删除查询成绩接口

- 0.0.8: 修改查询某学生已选课程接口，添加查询成绩接口

- 0.0.7: 修改查询某学生已选课程接口，删除查询成绩接口，新增三个getAll接口

- 0.0.6: 增加以下接口：查询某学生已选课程、教师选课、学生选课、查询成绩、登记成绩

- 0.0.5: 新增获取可打分课程和选了某课的学生的接口

- 0.0.4: 新增获得学生和老师可选课程的接口

- 0.0.3: 新增了选课开始和结束的接口

- 0.0.2: 所有year字段全部改成整数值

- 0.0.1: init, 增加课程信息的增删改

