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
public class GiaoDich {
    private String maGD;
    private String ngayGD;
    private double donGia;
    private long dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, String ngayGD, double donGia, long dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public long getDienTich() {
        return dienTich;
    }

    public void setDienTich(long dienTich) {
        this.dienTich = dienTich;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma GD: ");
        maGD = nhap.nextLine();
        System.out.print("Nhap ngay GD (ngay/ thang/ nam): ");
        ngayGD = nhap.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = nhap.nextDouble();
        System.out.print("Nhap dien tich: ");
        dienTich = nhap.nextLong();
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }
}
