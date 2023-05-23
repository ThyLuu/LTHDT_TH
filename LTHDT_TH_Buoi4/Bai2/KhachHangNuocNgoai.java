/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(String quocTich, String maKH, String hoTen, String ngayRaHD, int soLuong, double donGia, double thanhTien) {
        super(maKH, hoTen, ngayRaHD, soLuong, donGia, thanhTien);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap quoc tich: ");
        quocTich = nhap.nextLine();
    }
    
    public double tTien(){
        return this.thanhTien = this.soLuong * this.donGia;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" + "quocTich=" + quocTich + '}';
    }
}
