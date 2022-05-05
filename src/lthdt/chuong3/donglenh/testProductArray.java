/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffeelogic.Product;
import lthdt.chuong3.coffeelogic.ProductCompByName;

/**
 *
 * @author Admin
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // tao cac san pham
        Product[] sp = new Product[]{new Product("Sunsilk",12 ),
                                     new Product("Lifeboy", 5),
                                     new Product("Sunsilk",8 ),
                                     new Product("Espresso", 2),
                                     new Product("Thien long", 1)};
          System.out.println("mang ban dau la");
          System.out.println(Arrays.toString(sp));
//          Product temp;
//          for(int i = 0; i < sp.length - 1; i++)
//              for (int j = i + 1; j < sp.length; j++)
//                  if(sp[i].getPrice()> sp[j].getPrice()){
//                      temp = sp[i];
//                      sp[i] = sp[j];
//                      sp[j] = temp;
        
       
//    
// sap xep mang theo gia ca
//       Arrays.sort(sp, new ProductCompByPrice());
//       System.out.println("mang sap xep tang dan theo gia ca");
//       System.out.println(Arrays.toString(sp));
       System.out.println("sap xep theo ten san pham");
       Arrays.sort(sp, new ProductCompByName());
       System.out.println(Arrays.toString(sp));
       
       int index = Arrays.binarySearch(sp, new Product("sunsilk", 12 ), new ProductCompByName());
       if(index < 0){
           System.out.println("Khong tim thay");
           
       }else{
           System.out.println("Phan tu thu" + index + "chua gia tri can tim ");
           System.out.println(sp[index]);
       }
          
          
        
                
        
    }          
        
}
    

