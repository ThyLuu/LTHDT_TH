/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Account {

    private double soTien;
    private long soTK;
    private String tenTK;
    private String trangThai;
    final double laiSuat = 0.035;
    Locale local = new Locale("vi", "vn");
    NumberFormat format = NumberFormat.getCurrencyInstance(local);
    Scanner sc = new Scanner(System.in);

    public Account() {
        this.soTien = 50;
        this.soTK = 999999;
        this.tenTK = "Chua xac dinh";
        this.trangThai = "";
    }

    public Account(double soTien, long soTK, String tenTK, String trangThai) {
        this.soTien = soTien;
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.trangThai = trangThai;
    }

    public Account(long soTK, String tenTK) {
        this.soTK = soTK;
        this.tenTK = this.tenTK;
        this.soTien = 50;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = soTien;
        } else {
            this.soTien = 50;
        }
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        if (soTK > 0 && soTK != 999999) {
            this.soTK = soTK;
        } else {
            this.soTK = 999999;
        }
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        if (tenTK != "") {
            this.tenTK = tenTK;
        } else {
            this.tenTK = "Chua xac dinh";
        }
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Account{" + "soTien=" + soTien + ", soTK=" + soTK + ", tenTK=" + tenTK + ", trangThai=" + trangThai + '}';
    }

    public void Nhap() {
        System.out.printf("Nhap ten tai khoan: ");
        tenTK = sc.nextLine();
        System.out.printf("Nhap so tai khoan: ");
        soTK = sc.nextLong();
        System.out.printf("Nhap so tien: ");
        soTien = sc.nextDouble();
    }

    public void Xuat() {
        System.out.format("%-20s %-20d %-20f \n",
                tenTK, soTK, soTien);
    }

//    public double napTien() {
//        Scanner sc = new Scanner(System.in);
//        double nap;
//        System.out.print("So tien can nap : ");
//        nap = sc.nextDouble();
//        if (nap >= 0) {
//            soTien = nap + soTien;
//            Locale local = new Locale("vi", "vn");
//            NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
//            String st = formatter.format(nap);
//            System.out.println("Ban vua nap " + st + " vao tai khaoan.");
//        } else {
//            System.out.println("So tien khong hop le");
//        }
//        return nap;
//    }

//    public double rutTien() {
//        Scanner sc = new Scanner(System.in);
//        double rut;
//        System.out.print("Nhap so tien ban muon rut : ");
//        rut = sc.nextDouble();
//
//        if (rut <= (soTien)) {
//            soTien = soTien - (rut);
//            Locale local = new Locale("vi", "VN");
//            NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
//            String st = formatter.format(rut);
//            System.out.println("Ban vua rut " + st + "tu tai khoan");
//        } else {
//            System.out.println("So tien muon rut khong hop le");
//            return rutTien();
//        }
//        return rut;
//    }

//    public void chuyenKhoan() {
//        Account a[] = null;
//        Account acc = new Account();
//        int k, b, n = 0;
//        long s, d, c, f;
//        double chuyen, nhan, tienChuyen;
//        System.out.print("Nhap tai khoan de chuyen : ");
//        s = sc.nextLong();
//        System.out.print("Nhap so tai khoan nhan tien : ");
//        c = sc.nextLong();
//        for (int i = 0; i < n; i++) {
//            d = a[i].getSoTK();
//            if (s == d) {
//                chuyen = a[i].getSoTien();
//                for (int j = 0; j < n; j++) {
//                    f = a[j].getSoTK();
//                    if (c == f) {
//                        nhan = a[j].getSoTien();
//                        System.out.println("Nhap so tien can chuyen");
//                        tienChuyen = sc.nextDouble();
//                        if (tienChuyen <= chuyen) {
//                            chuyen = chuyen - tienChuyen;
//                            nhan = nhan + tienChuyen;
//                            a[i].setSoTien(chuyen);
//                            a[j].setSoTien(nhan);
//                            System.out.println("Tai khoan  " + d + " Vua chuyen :" + tienChuyen);
//                            System.out.println("Tai khoan " + f + " Vua nhan duoc : " + tienChuyen);
//                        } 
//                        else {
//                            System.out.println("So tien nhap khong hop le");
//                        }
//                    } 
//                    else {
//                        System.out.println("");
//                    }
//                }
//            } 
//            else {
//                System.out.println("");
//            }
//        }
//    }

//    public double DaoHan() {
//        double laiSuat = 0.035;
//        soTien = soTien + soTien * laiSuat;
//        Locale local = new Locale("vi", "vn");
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
//        String st = formatter.format(soTien);
//        System.out.println("Ban vua nhan duoc " + st);
//        return soTien;
//    }
}
