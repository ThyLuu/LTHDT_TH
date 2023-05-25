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
public class PhongThiNghiem extends PhongHoc{
    private String chuyenNganh;
    private int sucChua;
    private int soBonRua;

    public PhongThiNghiem() {
    }

    public PhongThiNghiem(String chuyenNganh, int sucChua, int soBonRua) {
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.soBonRua = soBonRua;
    }

    public PhongThiNghiem(String chuyenNganh, int sucChua, int soBonRua, String maPhong, String dayNha, int dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.soBonRua = soBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public int getSoBonRua() {
        return soBonRua;
    }

    public void setSoBonRua(int soBonRua) {
        this.soBonRua = soBonRua;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chuyen nganh: ");
        chuyenNganh = nhap.nextLine();
        System.out.print("Nhap suc chua: ");
        sucChua = nhap.nextInt();
        System.out.print("Nhap so bon rua: ");
        soBonRua = nhap.nextInt();
        if(soBonRua == 0){
            System.out.println("Phong khong co may tinh");
        }
        else {
            System.out.println("Phong co " +soBonRua+ " may tinh");
        }
    }

    @Override
    public Boolean datTieuChuan() {
        if( (getDienTich()/getSoBongDen() <= 10) && soBonRua > 0){
            return true;
        }else
            return false;

    }

    
}
