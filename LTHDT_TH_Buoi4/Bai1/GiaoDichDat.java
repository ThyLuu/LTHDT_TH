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
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat, String maGD, String ngayGD, double donGia, long dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap loai dat (A/ B/ C): ");
        loaiDat = nhap.nextLine();
    }
    
    @Override
    public String toString() {
        return "GiaoDichDat{" + "loaiDat=" + loaiDat + '}';
    }
}
