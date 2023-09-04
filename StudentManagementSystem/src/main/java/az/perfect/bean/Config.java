/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

import az.perfect.util.FileUtil;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Hp electron
 */
public class Config implements Serializable{
    
    private LinkedList<Student> students = new LinkedList();
    private LinkedList<Teacher> teachers = new LinkedList();
    private static boolean loggedIn;

    //objectleri fayla yazdirmaq ucun metod yaradiriq
    public static void save() {
        FileUtil.writeObjectToFile(Config.instance(), "managementapp.obj");
    }
    
    //obyektleri fayldan oxumaq ucun yaradilan metod
    public static void initialize() {
        
        Object obj = FileUtil.readObjectFromFile("managementapp.obj");
        if(obj instanceof Config) {
            config = (Config) obj;
        }
    }
    
    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
    
    
    
    public static Config config = null;
    
    public static Config instance() {
        if(config == null) {
            config = new Config();
        }
        return config;
    }
    
    
    public LinkedList<Student> getStudent() {
        return students;
    }

    public void setStudent(Student student) {
        this.students.add(student);
    }

    public LinkedList<Teacher> getTeacher() {
        return teachers;
    }

    public void setTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    
    
}
