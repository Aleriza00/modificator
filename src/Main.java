public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student = new Student("sam", "ann", 2004, "aleriza@gmail.com");
        Student student2 = new Student("moon", "sun", 2002, "leriza@gmail.com");
        Student student3 = new Student("flower", "water", 2000, "eliza@gmail.com");
        student.methodBirth();
        Student[] studentss = {student, student2, student3};

        Group group = new Group();
        Group group1 = new Group(studentss, "Software dev", 1);
        System.out.println(group1);
        Group group2= new Group(studentss,"backend",17);
        System.out.println(group2);


        Group[] groups = {group1,group2};

        Course  course = new Course("Java",7,"Kasymov Timur",groups);
        System.out.println(course);

    }
}