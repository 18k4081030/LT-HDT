/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.b2;

/**
 *
 * @author Admin
 */
public class bai4 {
     public static void main(String[] args){
          Shape htron = new cirlce(5 , 1 , 2);
//          System.out.println("chu vi cua hinh tron la:" + htron .calcPerimeter());
//          System.out.println("dien tich cua hinh tron la:" + htron.calcArea());
          System.out.println(htron.toString());
          Shape hcn = new rectangle(3, 15 , 8 , 5);
//          System.out.println("chu vi cua hinh chu nhat la:" + hcn .calcPerimeter());
//          System.out.println("dien tich cua hinh chu nhat la:" + hcn.calcArea());
          System.out.println(hcn);
     }
}
