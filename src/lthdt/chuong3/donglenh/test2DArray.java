/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test2DArray {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main (String[] args){
        //C1: khai bao mang 2 chiue
        int[][] matran = new int [][]{{1, 2, 3,},{4, 5, 6},{7, 8, 9} };
        //khoi tao ma tran 2 chieu 5x7
//        matran = new int[5][7];
        //khoi tao gia tri cua ma tran bang cach sinh ngau nhien
//        Random rnd = new Random();
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i< matran.length; i++)
//            for(int j = 0; j<matran[i].length; j++){
//                matran[i][j]= rnd.nextInt(1000);
//                  System.out.println("a[" + i + ","+ j + "] = ");
//                  String input = sc.nextLine();
//                  int n = Integer.parseInt(input);
//                  matran[i][j]=n;
//            }
        // Xuat gia tri cua ma tran ra mang hinh
        for(int i = 0;i< matran.length; i++){
            for(int j = 0; j< matran[i].length; j++)
                System.out.print(matran[i][j] + " ");
        System.out.println();
        }
    }
    
}
