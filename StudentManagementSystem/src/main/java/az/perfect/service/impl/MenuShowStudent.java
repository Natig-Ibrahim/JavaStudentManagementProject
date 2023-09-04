/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.bean.Student;
import az.perfect.service.inter.MenuService;
import java.util.LinkedList;

/**
 *
 * @author Hp electron
 */
public class MenuShowStudent implements MenuService{

    @Override
    public void process() {

        LinkedList<Student> students = Config.instance().getStudent();
        students.forEach(s -> System.out.println(s));
        
        
    }
    
}
