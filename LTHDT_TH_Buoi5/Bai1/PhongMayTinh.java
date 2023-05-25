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
public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;

    public PhongMayTinh() {
    }

    public PhongMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public PhongMayTinh(int soMayTinh, String maPhong, String dayNha, int dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so may chieu: ");
        soMayTinh = nhap.nextInt();
        if(soMayTinh == 0){
            System.out.println("Phong khong co may tinh");
        }
        else {
            System.out.println("Phong co " +soMayTinh+ " may tinh");
        }
    }

    @Override
    public Boolean datTieuChuan() {
        if( (getDienTich()/getSoBongDen()<= 10) && getDienTich()/soMayTinh <= 1.5){
            return true;
        }
        else {
            return false;
        }     
    }
}

