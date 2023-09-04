/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author Hp electron
 */
public class Teacher extends Person{
    private String schoolname;
    private double salary;

    public Teacher() {
    }

    public Teacher(String schoolname, double salary, String name, String surname, int age) {
        super(name, surname, age);
        this.schoolname = schoolname;
        this.salary = salary;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "schoolname=" + schoolname + ", salary=" + salary  + 
                ", name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge();
    }
    
    
}
