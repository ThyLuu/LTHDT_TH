/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;
    
    int chon;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi, int chon, String maGD, String ngayGD, double donGia, long dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.chon = chon;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    @Override
    public void nhap() {
        super.nhap(); 
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap dia chi: ");
        diaChi = nhap.nextLine();
        System.out.print("Nhap loai nha (0: cao cap/ 1: thuong): ");
        loaiNha = nhap.nextLine();
        switch(chon){
            case 0:
                loaiNha = "cao cap";
                break;
            case 1:
                loaiNha = "thuong";
                break;    
            default:
                System.out.println("Loi, lua chon khong hop le");
                break;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" + "loaiNha=" + loaiNha + ", diaChi=" + diaChi + '}';
    }
}
