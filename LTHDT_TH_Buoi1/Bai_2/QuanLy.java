/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLy {

    Scanner nhap = new Scanner(System.in);
    List<LopHocPhan> dsLopHocPhan = new ArrayList<>();

    public void Menu() {
        while (true) {
            System.out.println("======");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Xuat thong tin");
            System.out.println("3. Thoat");
            System.out.println("======");
            System.out.println("Hay chon: ");
            int chon = nhap.nextInt();

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Hay nhap lai");
                    break;
            }
        }
    }

    public void nhap() {
        System.out.println("Nhap thong tin lop hoc phan:");
        System.out.print("Tong so sinh vien: ");
        int tongSoSV = nhap.nextInt();
        nhap.nextLine();
        System.out.print("Ma LHP: ");
        String maLHP = nhap.nextLine();
        System.out.print("Ten LHP: ");
        String tenLHP = nhap.nextLine();
        System.out.print("Ten giang vien: ");
        String tenGV = nhap.nextLine();
        System.out.print("Thong tin buoi hoc: ");
        String thongTinLopHoc = nhap.nextLine();
        SinhVien[] dsSV = new SinhVien[tongSoSV];
        for (int i = 0; i < tongSoSV; i++) {
            System.out.println("Nhap tong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSV = nhap.nextLine();
            System.out.print("Ho ten sinh vien: ");
            String hoTenSV = nhap.nextLine();
            dsSV[i] = new SinhVien(maSV, hoTenSV);
        }
        LopHocPhan lopHocPhan = new LopHocPhan();
        lopHocPhan.setDsSinhVien(dsSV);
        lopHocPhan.setMaLHP(maLHP);
        lopHocPhan.setTenLHP(tenLHP);
        lopHocPhan.setTenGV(tenGV);
        lopHocPhan.setThongTinLopHoc(thongTinLopHoc);
        dsLopHocPhan.add(lopHocPhan);
        System.out.println("Da them thong tin lop hoc phan vao danh sach.");
    }

    public void xuat() {
        System.out.println("Danh sach lop hoc phan:");
        for (LopHocPhan lhp : dsLopHocPhan) {
            System.out.print(lhp);
            System.out.println();
        }
    }
}
