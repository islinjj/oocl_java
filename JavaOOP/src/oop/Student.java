package oop;

public class Student {

    private String name;

    private int age;

    private char gender;

    private String idNo;

    public Student(String name, int age, char gender, String idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", idNo='" + idNo + '\'' +
                '}';
    }
}

