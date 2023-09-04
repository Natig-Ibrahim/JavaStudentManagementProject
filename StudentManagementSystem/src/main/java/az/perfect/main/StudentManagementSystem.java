/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package az.perfect.main;

import az.perfect.bean.Config;
import az.perfect.util.MenuUtil;

/**
 *
 * @author Hp electron
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        
        Config.initialize();
        MenuUtil.menuProcess();
    }
}
