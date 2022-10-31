package top.garret.utils;

public class SystemStatus {
    private Integer year;
    private Integer semester;
    private Boolean open;

    public SystemStatus() {
        year = 2022;
        semester = 1;
        open = Boolean.TRUE;
    }

    public boolean flip(boolean begin) {
        if (begin == open)
            return false;
        open = begin;
        if (begin) {
            semester = semester == 1 ? 2 : 1;
            year += semester == 1 ? 1 : 0;
        }
        return true;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "SystemStatus{" +
                "year=" + year +
                ", semester=" + semester +
                ", open=" + open +
                '}';
    }
}
