package top.garret.entity;

public class StudentToCourse {
    private Integer sid;
    private Integer cid;
    private Integer score;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentToCourse{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", score=" + score +
                '}';
    }
}
