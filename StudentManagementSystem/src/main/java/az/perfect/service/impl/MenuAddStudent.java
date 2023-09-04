/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.bean.Student;
import az.perfect.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author Hp electron
 */
public class MenuAddStudent implements MenuService{

    @Override
    public void process() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pleace enter your name: ");
        String name = sc.next();
        System.out.print("Pleace enter your surname: ");
        String surname = sc.next();
        System.out.print("Pleace enter your age: ");
        int age = sc.nextInt();
        System.out.print("Pleace enter your schoolname: ");
        String schoolname = sc.next();
        System.out.print("Pleace enter your salary: ");
        double scholarship = sc.nextDouble();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSchoolname(schoolname);
        s.setScholarship(scholarship);
        
        Config.instance().setStudent(s);
        //melumatlar daxil olduqdan sonra aparib config class-nda saxlayir
        Config.save();
    }
    
}
