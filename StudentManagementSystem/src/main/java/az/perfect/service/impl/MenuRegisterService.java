/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.service.inter.MenuRegisterServiceInter;
import az.perfect.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author Hp electron
 */
public class MenuRegisterService implements MenuRegisterServiceInter{

    @Override
    public void process() {        
       
        System.out.println("Pleace register here.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleace enter your name: ");
        String username = sc.next();
        System.out.print("Pleace enter your password: ");
        String password = sc.next();
    }
    
}
