/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1b;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HangThucPham {

    private int maHang;
    private String tenHang;
    private String ghiChu;
    private double donGia;
    private Date ngaySX;
    private Date ngayHH;

    public HangThucPham() {
    }

    public HangThucPham(int maHang, String tenHang, String ghiChu, double donGia, Date ngaySX, Date ngayHH) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ghiChu = ghiChu;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(Date ngayHH) {
        this.ngayHH = ngayHH;
    }

    public void xuat() {
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        String nsx = dtf.format(ngaySX);
        String nhh = dtf.format(ngayHH);
        System.out.format("%-20d %-20s %-20f %-20s %-20s %-20s \n",
                maHang, tenHang, donGia, ngaySX, ngayHH, ghiChu);
    }

    public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngaySX = calendar.getTime();
    }

    public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayHH = calendar.getTime();
    }

    public boolean kiemTraTenHang(boolean k) {
        if (this.tenHang == " " || this.tenHang.isEmpty()) {
            System.out.println("Ten hang khong duoc de trong : ");
        } else {
            k = false;
        }
        return k;
    }

    public boolean kiemTraNgay(boolean b) {
        if (this.ngaySX.compareTo(this.ngayHH) < 0) {
            b = false;
        } else {
            System.out.println("Ngay het han khong duoc nho hon ngay san xuat : ");
        }
        return b;
    }

    public void kiemTraNgayHH() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.ngayHH.compareTo(today) < 0) {
            System.out.println("Hom nay la ngay " + st + ", hang hoa da het han ");
        } else {
            System.out.println("Hom nay la ngay " + st + ", hang hoa van con han ");
        }
    }
}


