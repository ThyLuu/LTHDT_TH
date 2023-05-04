/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CDList {

    ArrayList<CD> cdLs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon;

    public CDList() {
        this.cdLs = new ArrayList<>();
    }

    public void Them() {
        CD cd = new CD();
        cd.nhap();
        boolean kt = false;
        for (CD cd1 : cdLs) {
            if (cd1.getMaCD() == cd.getMaCD()) {
                kt = true;
                break;
            }
        }
        if (kt) {
            System.out.println("Ma CD da ton tai!");
        } else {
            cdLs.add(cd);
            System.out.println("them thanh cong");
        }

    }

    public int count() {
        System.out.println("So luong: ");
        return cdLs.size();
    }

    public double Tong() {
        CDList cd = new CDList();
        double tong = 0;
        for (CD cd1 : cdLs) {
            tong += cd1.getGiaThanh();
        }
        return tong;
    }

    public void sapXepCDTheoGia() {
        Collections.sort(this.cdLs, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                int i = (int) (o1.getGiaThanh() - o2.getGiaThanh());
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        }
        );
    }

    public void sapXepCDTheoTua() {
        Collections.sort(this.cdLs, (CD o1, CD o2) -> {
            int i = o1.getTuaCD().compareTo(o2.getTuaCD());
            if (i < 0) {
                return 1;
            } else if (i == 0) {
                return 0;
            }
            return -1;
        });
    }

    public void in() {
        for (CD cd : cdLs) {
            System.out.println(cd.toString());
        }
    }

    public void Menu() {
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Them CD");
            System.out.println("2. Tinh so luong hien co");
            System.out.println("3. Tinh tong gia thanh cac CD");
            System.out.println("4. Sap xep giam dan theo gia thanh");
            System.out.println("5. Sap xeo tang dan theo tua CD");
            System.out.println("6. In thong tin CD");
            System.out.println("7. Thoat");
            System.out.println("=== === ===");
            System.out.print("Hay chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    Them();
                    break;
                case 2:
                    count();
                    break;
                case 3:
                    Tong();
                    break;
                case 4:
                    sapXepCDTheoGia();
                    break;
                case 5:
                    sapXepCDTheoTua();
                    break;
                case 6:
                    in();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Hay nhap lai");
            }
        } while (chon != 6);
    }
}
