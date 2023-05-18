/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien {

    private String maSV;
    private String hoTen;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void hien() {
//        System.out.format("%-20s %-20s %-20s \n", "Ma SV", "Ho ten", "Nam sinh");
        System.out.format("%-20s %-20s %-20s \n", maSV, hoTen, namSinh);
    }
}