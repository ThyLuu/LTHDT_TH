/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PhongHoc {
    private String maPhong;
    private String dayNha;
    private int dienTich;
    private int soBongDen;

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String dayNha, int dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        maPhong = nhap.nextLine();
        System.out.print("Nhap day nha: ");
        dayNha = nhap.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = nhap.nextInt();
        System.out.print("Nhap so bong den: ");
        soBongDen = nhap.nextInt();
    }
    
    public Boolean datTieuChuan(){
        if(dienTich/soBongDen <= 10){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + '}';
    }
}
