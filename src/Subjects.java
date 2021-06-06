public class Subjects {
    private String SubName;
    Integer mark;

    public Subjects(String SubName, Integer mark) {
        this.SubName = SubName;
        this.mark = mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getSubName() {
        return SubName;
    }

    public Integer getMark() {
        return mark;
    }
}
