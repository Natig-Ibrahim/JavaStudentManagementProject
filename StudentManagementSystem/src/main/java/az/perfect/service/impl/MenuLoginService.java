/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.service.inter.MenuService;
import java.util.Scanner;
import az.perfect.service.inter.MenuLoginServiceInter;

/**
 *
 * @author Hp electron
 */
public class MenuLoginService implements MenuLoginServiceInter{

    @Override
    public void process() {

        System.out.println("Pleace login here.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleace enter your username: ");
        String username = sc.next();
        System.out.print("Pleace enter your password: ");
        String password = sc.next();
        
        if(!(username.equals("admin") && password.equals("12345"))){
            System.out.println("Pleace enter right username and password!");
            process();
        }
        
        Config.setLoggedIn(true);
        
    }
    
}
