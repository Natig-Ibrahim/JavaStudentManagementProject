/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author Hp electron
 */
public class Student extends Person{
    
    private String schoolname;
    private double scholarship;

    public Student(String name) {
    }

    public Student(String schoolname, double scholarship, String name, String surname, int age) {
        super(name, surname, age);
        this.schoolname = schoolname;
        this.scholarship = scholarship;
    }

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    
    @Override
    public String toString() {
        return "schoolname=" + schoolname + ", scholarship=" + scholarship  + 
                ", name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge();
    }
}
