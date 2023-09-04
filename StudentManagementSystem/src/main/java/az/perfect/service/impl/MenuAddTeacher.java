/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.bean.Teacher;
import az.perfect.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author Hp electron
 */
public class MenuAddTeacher implements MenuService{

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
        double salary = sc.nextDouble();
        
        Teacher t = new Teacher();
        
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
        t.setSchoolname(schoolname);
        t.setSalary(salary);
        
        Config.instance().setTeacher(t);
        
        
        
    }
    
}
