import java.util.Arrays;

public class Group {
    private Student[] students;
    private String direction;
    private int startL;

    public Group(Student[] students, String direction, int startL) {
        this.students = students;
        this.direction = direction;
        this.startL = startL;
    }
    public  Group(){}

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getStartL() {
        return startL;
    }

    public void setStartL(int startL) {
        this.startL = startL;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", direction='" + direction + '\'' +
                ", startL=" + startL +
                '}';
    }
}
