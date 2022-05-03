/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.b2;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements TaxInterface {
    private String truonghoc ;

    public Student() {
    }

    public Student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public Student(String dai_hoc_hue_, String xuat_sac, String nguyen_Van_A, int i, Date ngaysinh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01 * income;
        return tax;
        
    }
 
}
