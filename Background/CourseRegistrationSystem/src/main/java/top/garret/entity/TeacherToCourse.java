package top.garret.entity;

public class TeacherToCourse {
    private Integer tid;
    private Integer cid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "TeacherToCourse{" +
                "tid=" + tid +
                ", cid=" + cid +
                '}';
    }
}
