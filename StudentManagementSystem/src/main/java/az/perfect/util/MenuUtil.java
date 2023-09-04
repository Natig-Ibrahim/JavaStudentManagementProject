/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.util;

import az.perfect.bean.Config;
import java.util.Scanner;

/**
 *
 * @author Hp electron
 */
public class MenuUtil {
    
    public static void showMenu() {
        Menu m[] = Menu.values();
        for(int i=0; i < m.length; i++) {
            if(m[i] != Menu.UNKNOWN) {
                if(m[i] == Menu.REGISTER || m[i] == Menu.LOGIN){
                    if(!Config.isLoggedIn()) {
                        System.out.println(m[i]);
                    }
                }
            }else if(Config.isLoggedIn()) {
                System.out.println(m[i]);
            }
                
        }    
    }
    
    public static void menuProcess() {
        System.out.println("Select menu: ");
        MenuUtil.showMenu();
        Scanner sc = new Scanner(System.in);
        int sm = sc.nextInt();
        Menu.findNumber(sm).enumProcess();//buradaki enumProcess override oldugu ucun gedir servicenin icindeki MenuServicelere
    }
}
