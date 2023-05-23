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
public class KhachHangVietNam extends KhachHang{
    private int loaiKH;
    private int dinhMuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(int loaiKH, int dinhMuc) {
        this.loaiKH = loaiKH;
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam(int loaiKH, int dinhMuc, String maKH, String hoTen, String ngayRaHD, int soLuong, double donGia, double thanhTien) {
        super(maKH, hoTen, ngayRaHD, soLuong, donGia, thanhTien);
        this.loaiKH = loaiKH;
        this.dinhMuc = dinhMuc;
    }

    public int getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(int loaiKH) {
        this.loaiKH = loaiKH;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Loai KH 1. sinh hoat/ 2. kinh doanh/ 3. san xuat: ");
        loaiKH = nhap.nextInt();
        System.out.print("Nhap dinh muc: ");
        dinhMuc = nhap.nextInt();
    }
    
    public double tTien(){
        if(soLuong <= dinhMuc){
            return this.thanhTien = this.donGia * this.soLuong;
        }
        else {
            return this.thanhTien = this.dinhMuc * this.donGia + (this.soLuong - this.dinhMuc) * this.donGia * 2.5;
        }
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" + "loaiKH=" + loaiKH + ", dinhMuc=" + dinhMuc + '}';
    }
}
