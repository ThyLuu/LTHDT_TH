/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<GiaoDichDat> gdd = new ArrayList<>();
        ArrayList<GiaoDichNha> gdn = new ArrayList<>();
        int soGDD = 0, soGDN = 0;
        double tongTienGDD = 0;
        double trungBinhThanhTienGDD = 0;
        double tongTienGDN = 0;

        Scanner nhap = new Scanner(System.in);
    
        System.out.print("Ten SV: ");
        String ten = nhap.nextLine();
        System.out.print("MSSV: ");
        String mssv = nhap.nextLine();
        System.out.print("Lop: ");
        String lop = nhap.nextLine();
        
        System.out.print("Nhap so dat can giao dich: ");
        soGDD = nhap.nextInt();
        System.out.print("Nhap so nha can giao dich: ");
        soGDN = nhap.nextInt();

        System.out.println("=== NHAP THONG TIN GD DAT ===");
        for (int i = 0; i < soGDD; i++) {
            System.out.println("Nhap thong tin GD dat thu " + i + " : ");
            GiaoDichDat newgdd = new GiaoDichDat();
            newgdd.nhap();
            gdd.add(newgdd);
        }

        System.out.println("=== NHAP THONG TIN GD NHA ===");
        for (int i = 0; i < soGDN; i++) {
            System.out.println("Nhap thong tin GD nha thu " + i + " : ");
            GiaoDichNha newgdn = new GiaoDichNha();
            newgdn.nhap();
            gdn.add(newgdn);
        }
    

        System.out.println("=== XUAT THONG TIN GD DAT ===");
        for (int i = 0; i < gdd.size(); i++) {
            System.out.println(gdd.get(i).toString());
        }

        System.out.println("=== XUAT THONG TIN GD NHA ===");
        for (int i = 0; i < gdn.size(); i++) {
            System.out.println(gdn.get(i).toString());
        }

        for (int i = 0; i < gdd.size(); i++) {
            if (gdd.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGDD += gdd.get(i).getDienTich() * gdd.get(i).getDonGia() * 1.5;
            } else if (gdd.get(i).getLoaiDat().equalsIgnoreCase("B")
                    || gdd.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGDD += gdd.get(i).getDienTich() * gdd.get(i).getDonGia();
            }
        }

        trungBinhThanhTienGDD = tongTienGDD / (gdd.size());
        System.out.println("Trung binh thanh tien cua GD dat: " + trungBinhThanhTienGDD);

        for (int i = 0; i < gdn.size(); i++) {
            if (gdn.get(i).getLoaiNha().equalsIgnoreCase("cao cap")) {
                tongTienGDN += gdn.get(i).getDienTich() * gdn.get(i).getDonGia();
            } else if (gdn.get(i).getLoaiNha().equalsIgnoreCase("thuong")) {
                tongTienGDN += gdn.get(i).getDienTich() * gdn.get(i).getDonGia() * 0.9;
            }
        }

        System.out.println("=== Giao dich dat cua thang 5 nam 2023 ===");
        for (int i = 0; i < gdd.size(); i++) {
            String[] dateGDD = gdd.get(i).getNgayGD().split("/");
            if (dateGDD[1].equals("5")
                    && dateGDD[2].equals("2023")) {
                System.out.println(gdd.get(i).toString());
            }
        }

        System.out.println("=== Giao dich nha cua thang 5 nam 2023 ===");
        for (int i = 0; i < gdn.size(); i++) {
            String[] dateGDD = gdn.get(i).getNgayGD().split("/");
            if (dateGDD[1].equals("5")
                    && dateGDD[2].equals("2023")) {
                System.out.println(gdn.get(i).toString());
            }
        }
    }
}    
