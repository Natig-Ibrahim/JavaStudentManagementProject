/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package az.perfect.util;

import az.perfect.service.impl.MenuAddStudent;
import az.perfect.service.impl.MenuAddTeacher;
import az.perfect.service.impl.MenuExitService;
import az.perfect.service.impl.MenuLoginService;
import az.perfect.service.impl.MenuRegisterService;
import az.perfect.service.impl.MenuShowStudent;
import az.perfect.service.impl.MenuShowTeacherService;
import az.perfect.service.impl.MenuUnknownService;
import az.perfect.service.inter.MenuService;

/**
 *
 * @author Hp electron
 */
public enum Menu {
    //ENUMLAR BOYUK HERFLERLE YAZILIR
    LOGIN(1, "Login", new MenuLoginService()), 
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add Students", new MenuAddStudent()),
    ADD_TEACHER(4, "Add Teachers", new MenuAddTeacher()),
    SHOW_STUDENT(5, "Show Students", new MenuShowStudent()),
    SHOW_TEACHER(6, "Show Teachers", new MenuShowTeacherService()),
    EXIT(7, "Exit", new MenuExitService()),
    //istifadeci menunun sayindan kenar reqem daxil etmeyinin qarsisin aliriq ve bunun ucun bos konstruktor yaradiriq
    UNKNOWN(new MenuUnknownService());


    
    private Menu(MenuService service) {
        this.service = service;
    }
    
    //menunun norelerin ve adin istediyimiz formada eks etdirmek ucun bu metodu yaradiriq ve yuxarida moterize daxilinde gosteririk
    private int num;
    private String text;
    private MenuService service;

    private Menu(int num, String text, MenuService service) {
        this.num = num;
        this.text = text;
        this.service = service;
    }

    @Override
    public String toString() {
        return num + "." + text;
    }
    
    //enumlarin her biri oz servisin goturmek ucun metod yaradiriq
    public void enumProcess() {
        service.process();
        MenuUtil.menuProcess();
    }
    
    //menunun punktlarin cagirmaq ucun bu metodlari yaradiriq
    public int getNum(){
        return num;
    }
    
    public static Menu findNumber(int selectedNum) {
        
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if(m[i].getNum() == selectedNum) {
                return m[i];
            }
        }
        return Menu.UNKNOWN;
    }
}
