import java.util.Arrays;

public class Course {
    private String nameCourse;
    private int number;
    private String aboutTeacher;
    private Group[] groups;

    public Course(String nameCourse, int number, String aboutTeacher, Group[] groups) {
        this.nameCourse = nameCourse;
        this.number = number;
        this.aboutTeacher = aboutTeacher;
        this.groups = groups;
    }
    public  Course(){

    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAboutTeacher() {
        return aboutTeacher;
    }

    public void setAboutTeacher(String aboutTeacher) {
        this.aboutTeacher = aboutTeacher;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameCourse='" + nameCourse + '\'' +
                ", number=" + number +
                ", aboutTeacher='" + aboutTeacher + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
