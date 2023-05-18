/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLy {

    ArrayList<SinhVien> sv = new ArrayList<>();
    Scanner nhap = new Scanner(System.in);

    public void Menu() {
        while (true) {
            System.out.println("======");
            System.out.println("1. Lay ds sinh vien");
            System.out.println("2. Them sv moi");
            System.out.println("3. Xoa sv");
            System.out.println("4. Sua thong tin sv");
            System.out.println("5. Tim kiem theo ten sv");
            System.out.println("6. Tim kiem theo ma sv");
            System.out.println("7. Sap xep tang dan");
            System.out.println("8. Thoat");
            System.out.println("======");
            System.out.print("Hay chon: ");
            int chon = nhap.nextInt();

            switch (chon) {
                case 1:
                    Xuat();
                    break;
                case 2:
                    Nhap();
                    break;
                case 3:
                    Xoa();
                    break;
                case 4:
                    ChinhSua();
                    break;
                case 5:
                    timTheoTenSV();
                    break;
                case 6:
                    timTheoMaSV();
                    break;
                case 7:
                    sapXepTheoMaSV();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Hay nhap lai");
                    break;
            }
        }
    }

    private void Nhap() {
        System.out.print("So sinh vien can them: ");
        int n = nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap tong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            nhap.nextLine();
            String maSV = nhap.nextLine();
            
            System.out.print("Ho ten sinh vien: ");
            String hoTen = nhap.nextLine();
            System.out.print("Nam sinh: ");
            int namSinh = nhap.nextInt();

            SinhVien nst = new SinhVien(maSV, hoTen, namSinh);
            sv.add(nst);
            System.out.println("Them thanh cong");
        }
    }

    public void Xuat() {
        System.out.println("Danh sach SV:");
        System.out.format("%-20s %-20s %-20s \n", "Ma SV", "Ho ten", "Nam sinh");
        for (SinhVien st : sv) {
            st.hien();
        }   
    }

    public void sapXepTheoMaSV() {
        Collections.sort(this.sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                int i = o1.getMaSV().compareTo(o2.getMaSV());
                if (i < 0) {
                    return 1;
                } else if (i == 0) {
                    return 0;
                }
                return -1;
            }
        });
    }

    public void Xoa() {
        System.out.print("Nhap ma sv muon xoa: ");
        nhap.nextLine();
        String maSV = nhap.nextLine();

        for (SinhVien st : sv) {
            if (st.getMaSV().equals(maSV)) {
                sv.remove(sv);
                System.out.println("Xoa thanh cong!");
            } 
        }
    }

    public void ChinhSua() {
        System.out.print("Nhap ma sv muon sua: ");
        String maSV = nhap.nextLine();

        for (SinhVien st : sv) {
            if (st.getMaSV().equals(maSV)) {
                System.out.print("Nhap ho ten moi: ");
                String hoTenMoi = nhap.nextLine();
                System.out.print("Nhap nam sinh moi: ");
                int namSinhMoi = nhap.nextInt();
                st.setHoTen(hoTenMoi);
                st.setNamSinh(namSinhMoi);
                System.out.println("Sua thanh cong");
            } else {
                System.out.println("Khong tim thay SV");
            }
        }
    }

    private void timTheoMaSV() {
        System.out.print("Nhap ma sv muon tim: ");
        String maSV = nhap.nextLine();
        for (SinhVien st : sv) {
            if (st.getMaSV().equals(maSV)) {
                System.out.println("SV can tim: " + sv.toString());
            } else {
                System.out.println("Khong tim thay SV");
            }
        }
    }
    
    private void timTheoTenSV() {
        System.out.print("Nhap ten sv can tim: ");
        String hoTen = nhap.nextLine();
        boolean tim = false;
        for (SinhVien st : sv) {
            if (st.getHoTen().equalsIgnoreCase(hoTen)) {
                System.out.println(st);
                tim = true;
            }
            else {
                System.out.println("Khong tim thay SV");
            }
        }
    }
    
//    private void sapXepTangDan() {
//        Collections.sort(sv, new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return o1.getMaSV().compareTo(o2.getMaSV());
//            }
//        });
//        
//    }
}
