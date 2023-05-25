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
public class PhongHocLyThuyet extends PhongHoc{
    private int soMayChieu;

    public PhongHocLyThuyet() {
    }

    public PhongHocLyThuyet(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    public PhongHocLyThuyet(int soMayChieu, String maPhong, String dayNha, int dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayChieu = soMayChieu;
    }

    public int getSoMayChieu() {
        return soMayChieu;
    }

    public void setSoMayChieu(int soMayChieu) {
        this.soMayChieu = soMayChieu;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so may chieu: ");
        soMayChieu = nhap.nextInt();
        if(soMayChieu == 0){
            System.out.println("Phong khong co may chieu");
        }
        else {
            System.out.println("Phong co " +soMayChieu+ " may chieu");
        }
    }

    @Override
    public Boolean datTieuChuan() {
        if( (getDienTich()/getSoBongDen()) <= 10 && soMayChieu > 0){
            return true;
        }else
            return false;
    }
}
