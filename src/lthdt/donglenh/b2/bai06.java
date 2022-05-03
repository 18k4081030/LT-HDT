/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.b2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person(" Nguyen Van B ", 0, ngaysinh);
        
        System.out.println(" Ho ten : " + person.getHoten() + "; gioi tinh : "
        + person.getGioitinh() + " ; ngay sinh: " +
                df.format(ngaysinh));
        
        Student Sinhvien = new Student();
        Sinhvien.setHoten("Nguyen van B ");
        Sinhvien.setGioitinh(1);
        Sinhvien.setNgaysinh(df.parse("12-12-2002"));
        Sinhvien.setTruonghoc("Dai hoc hue");
        System.out.println(Sinhvien.getHoten() + "; gioi tinh: " +
                Sinhvien.getGioitinh() + ";ngay sinh:" +
                df.format(Sinhvien.getNgaysinh()) + "; " +
                Sinhvien.getTruonghoc());
        System.out.println(Sinhvien.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-09-2003"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten() + "; gioitinh: " +
                congnhan.getGioitinh() + "; ngay sinh; " +
                df.format(congnhan.getNgaysinh()) + "; cong ty: "+
                congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
    }
}
