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
public class KhachHang {
    protected String maKH;
    protected String hoTen;
    protected String ngayRaHD;
    protected int soLuong;
    protected double donGia;
    protected double thanhTien;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String ngayRaHD, int soLuong, double donGia, double thanhTien) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayRaHD = ngayRaHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(String ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    public void nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma KH: ");
        maKH = nhap.nextLine();
        System.out.print("Nhap ho ten KH: ");
        hoTen = nhap.nextLine();
        System.out.print("Nhap ngay ra HD(ngay/ thang/ nam): ");
        ngayRaHD = nhap.nextLine();
        System.out.print("Nhap so luong (KW): ");
        soLuong = nhap.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = nhap.nextDouble();
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", ngayRaHD=" + ngayRaHD + ", soLuong=" + soLuong + ", donGia=" + donGia + ", thanhTien=" + thanhTien + '}';
    }
}
