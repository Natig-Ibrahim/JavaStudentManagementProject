/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.service.inter.MenuService;

/**
 *
 * @author Hp electron
 */
public class MenuExitService implements MenuService{

    @Override
    public void process() {

        System.out.println("siz programdan cixis etdiniz");
        System.exit(0);
    }
    
}
