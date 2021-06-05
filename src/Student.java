public class Student {
    private String name;
    private Integer age;
    private Subjects[] Subjects = new Subjects[6];

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.Subjects[0] = new Subjects("Math", 0);
        this.Subjects[1] = new Subjects("Russian", 0);
        this.Subjects[2] = new Subjects("Social", 0);
        this.Subjects[3] = new Subjects("D&T", 0);
        this.Subjects[4] = new Subjects("Literature", 0);
    }

    public void SetSubjectMark(Integer mark, int index) {
        this.Subjects[index].setMark(mark);
    }

    public void MoveSub(int index, int i) {
        this.Subjects[5] = this.Subjects[index];
        this.Subjects[index] = this.Subjects[i];
        this.Subjects[i] = this.Subjects[5];
    }

    public String getSubjectsName(int index) {
        return Subjects[index].getSubName();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public Integer getMark(int index) {
        return this.Subjects[index].getMark();
    }
}
