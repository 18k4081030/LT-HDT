/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] a;
        // khoi tao
//        a = new int [4];
//        a[0] = 12;
//        a[1] = 9;
//        a[3] = 15;
        // xuat du lieu
//        System.out.println(a.toString());
//        System.out.println(Arrays.toString(a));
        
//     int[] b = new int []{1, 3, -7, 8, 9, 20};
//     System.out.println(Arrays.toString(b));
//     System.out.println("so luong phan tu cua mang la " + b.length);
 
    Scanner sc = new Scanner(System.in);
    System.out.println("so luong phan tu cua mang n = ");
    String input = sc.nextLine();
    int n = Integer.parseInt(input);
    int[] c = new int[n];
//    for (int i = 0; i < n ; i++){
//        System.out.print("c[ " + i + "] = ");
//        input = sc.nextLine();
//        c[i] = Integer.parseInt(input);
//    }
//    System.out.println("gia tri cua mang nhap la");
////    System.out.println(Arrays.toString(c));
//     for(int i = 0 ; i < c.length; i++){
//     System.out.print(c[i] + " ");
     
     Random rnd = new Random();
     for(int i = 0; i < n; i++){
         c[i] = rnd.nextInt(1000);
         
    }
    System.out.println(Arrays.toString(c));
    
        
    
            
     

        
                
                
    }
    
}