/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLyPhongHoc {

    ArrayList<PhongHoc> ph = new ArrayList<>();
    ArrayList<PhongHocLyThuyet> phlt = new ArrayList<>();
    ArrayList<PhongMayTinh> pmt = new ArrayList<>();
    ArrayList<PhongThiNghiem> ptn = new ArrayList<>();

    Scanner nhap = new Scanner(System.in);
    int chon;

    public void menu() {
        do {
            System.out.println("======");
            System.out.println("1. Nhap phong hoc ly thuyet");
            System.out.println("2. DS phong hoc ly thuyet");
            System.out.println("3. Tim phong hoc");
            System.out.println("4. DS phong dat tieu chuan");
            System.out.println("5. Sap xep tang dan theo day nha");
            System.out.println("6. Sap xep giam dan theo dien tich");
            System.out.println("7. Sap xep tang dan theo so bong den");
            System.out.println("8. Cap nhat may tinh");
            System.out.println("9. Xoa phong hoc");
            System.out.println("10. Tong so phong hoc");
            System.out.println("11. DS phong co 60 may");
            System.out.println("0. Thoat");
            System.out.println("======");
            System.out.print("Hay chon: ");
            int chon = nhap.nextInt();

            switch (chon) {
                case 1:
                    themPhongHocLyThuyet();
                    break;
                case 2:
                    inDSPH();
                    break;
                case 3:
                    timPhongHoc();
                    break;
                case 4:
                    inDSPLTDatChuan();
                    break;
                case 5:
                    sapXepTangTheoDayNha();
                    break;
                case 6:
                    sapXepTangTheoDayNha();
                    break;
                case 7:
                    sapXepTangTheoBongDen();
                    break;
                case 8:
                    capNhatMayTinh();
                    break;
                case 9:
                    xoa();
                    break;
                case 10:
                    tongPH();
                    break;
                case 11:
                    inDShPhongMayCo60May();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hay nhap lai");
                    break;
            }
        } while (chon != 3);
    }

    public void themPhongHocLyThuyet() {
        System.out.print("So phong can nhap: ");
        int soPhong = nhap.nextInt();
        for (int i = 0; i < soPhong; i++) {
            System.out.println("Nhap thong tin phong hoc ly thuyet thu " + (i + 1) + ":");
            PhongHoc newph = new PhongHoc();
            newph.nhap();
            boolean check = false;
            for (PhongHoc x : ph) {
                if (x.getMaPhong() == newph.getMaPhong()) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Ma phong da ton tai");
            } else {
                ph.add(newph);
                System.out.println("Them thanh cong");
            }
        }
    }

    public void inDSPH() {
        for (PhongHoc x : ph) {
            System.out.format("%-20s %-20s %-20s %-20s %-20s \n",
                    "Ma phong",
                    "Day nha",
                    "Dien tich",
                    "So bong den",
                    "Ghi chu");
            System.out.format("%-20s %-20s %-20s %-20s %-20s \n",
                    x.getMaPhong(),
                    x.getDayNha(),
                    x.getDienTich(),
                    x.getSoBongDen(),
                    x.datTieuChuan());
        }
    }

    public PhongHoc timPhongHoc() {
        System.out.print("Nhap ma phong can tim: ");
        String maPH = nhap.nextLine();
        for (PhongHoc x : ph) {
            if (x.getMaPhong().equalsIgnoreCase(maPH)) {
                return x;
            }
        }
        return null;
    }

    public void inDSPLTDatChuan() {
        for (PhongHoc x : ph) {
            if (x.datTieuChuan()) {
                System.out.format("%-20s %-20s %-20s %-20s %-20s \n",
                        "Ma phong",
                        "Day nha",
                        "Dien tich",
                        "So bong den",
                        "Ghi chu");
                System.out.format("%-20s %-20s %-20s %-20s %-20s \n",
                        x.getMaPhong(),
                        x.getDayNha(),
                        x.getDienTich(),
                        x.getSoBongDen(),
                        x.datTieuChuan());
            }
        }

    }

    public void sapXepTangTheoDayNha() {
        Collections.sort(this.ph, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (o1.getDayNha().compareTo(o2.getDayNha()));
            }
        });
    }

    public void sapXepGiamTheoDienTich() {
        Collections.sort(this.ph, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (int) (o2.getDienTich() - (o1.getDienTich()));
            }
        });
    }

    public void sapXepTangTheoBongDen() {
        Collections.sort(this.ph, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return (int) (o1.getSoBongDen() - (o2.getSoBongDen()));
            }
        });
    }

    public void capNhatMayTinh() {
        System.out.print("Nhap ma phong can tim: ");
        String maPH = nhap.nextLine();
        System.out.print("Nhap so may tinh moi cap nhat: ");
        int mayMoi = nhap.nextInt();
        PhongHoc PH = timPhongHoc();
        if (PH != null && PH instanceof PhongMayTinh) {
            PhongMayTinh PMT = (PhongMayTinh) PH;
            PMT.setSoMayTinh(PMT.getSoMayTinh() + mayMoi);
            System.out.println("Cap nhat thanh cong");
        } else {
            System.out.println("Khong tim thay ma phong");
        }
    }

    public void xoa() {
        System.out.print("Nhap ma phong can tim: ");
        String maPH = nhap.nextLine();
        PhongHoc phongHoc = timPhongHoc();
        System.out.printf("Muon xoa phong hoc (y/ n): ");
        String xoaPH = nhap.nextLine();
        if (xoaPH.equalsIgnoreCase("y")) {
            if (phongHoc != null) {
                ph.remove(phongHoc);
                System.out.println("Xoa thanh cong");
            } else {
                System.out.println("Khong tim thay ma phong");
            }
        }
    }

    public int tongPH() {
        return ph.size();
    }

    public void inDShPhongMayCo60May() {
        System.out.println("DS phong hoc co 60 may: ");
        for (PhongHoc x : ph) {
            if (x instanceof PhongMayTinh && ((PhongMayTinh) x).getSoMayTinh() == 60) {
                System.out.format("%-20s %-20s %-20s %-20s \n",
                        "Ma phong",
                        "Day nha",
                        "Dien tich",
                        "So bong den",
                        System.out.format("%-20s %-20s %-20s %-20s \n",
                                x.getMaPhong(),
                                x.getDayNha(),
                                x.getDienTich(),
                                x.getSoBongDen()));
            }
        }
    }
}
