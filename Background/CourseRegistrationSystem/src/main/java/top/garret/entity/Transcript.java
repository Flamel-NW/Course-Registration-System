package top.garret.entity;

public class Transcript {
    private StudentToCourse studentToCourse;
    private Course course;
    private Teacher teacher;

    public StudentToCourse getStudentToCourse() {
        return studentToCourse;
    }

    public void setStudentToCourse(StudentToCourse studentToCourse) {
        this.studentToCourse = studentToCourse;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "studentToCourse=" + studentToCourse +
                ", course=" + course +
                ", teacher=" + teacher +
                '}';
    }
}
