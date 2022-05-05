/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong3.coffeelogic.Coffeeshop;
import lthdt.chuong3.coffeelogic.Manager;

/**
 *
 * @author Admin
 */
public class testcoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        
        Coffeeshop[] a = new Coffeeshop[]{new Coffeeshop ("Kha coffee","2 nguyen hue"),
                                          new Coffeeshop("White garden","4 nguyen hue"),
                                          new Coffeeshop("hoang truc vien","3 nguyen hue")};
      
        Manager[] managers = new Manager[]{
                             new Manager(a,1000, "Le Thi A", 0, df.parse("12-12-1999")),
                             new Manager(new Coffeeshop[]{
                                 new Coffeeshop("Hoang Hac","12 nguyen hue")
                             },
                                     2000, "Nguyen Van B", 1, df.parse("12-12-2000"))
        };
        System.out.println(Arrays.toString(managers));
    }
}
        
                                          
    
    
    

