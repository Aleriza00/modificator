

public class Student  {
    private String  surName;
    private String name;
    private int birthDay;
    private String email;

    public Student(String surName, String name, int birthDay, String email) {
        this.surName = surName;
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;

    }
    public  void  methodBirth(){
        if (getBirthDay()>0){
            System.out.println(birthDay);
        }
    }
    public  Student(){  }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", email='" + email + '\'' +
                '}';
    }
}
