/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import Bai1.GiaoDichDat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLy {

    KhachHang kh[] = new KhachHang[50];
    int countKH, tong1 = 0, tong2 = 0, dem = 0, tongtien = 0;

    public QuanLy() {
        countKH = 0;
        for (int i = 0; i < 50; i++) {
            kh[i] = new KhachHang();
        }
    }

    public void them(int temp) {
        if (countKH > 50) {
            System.out.println("Loi, da du 50 KH");
        } else {
            if (temp == 1) {
                kh[countKH] = new KhachHangVietNam();
                KhachHangVietNam newkhvn = new KhachHangVietNam();
                newkhvn.nhap();;
                newkhvn.thanhTien = newkhvn.tTien();
                kh[countKH] = newkhvn;
                tong1 += newkhvn.soLuong;
                
            } else {
                kh[countKH] = new KhachHangNuocNgoai();
                KhachHangNuocNgoai newkhnn = new KhachHangNuocNgoai();
                newkhnn.nhap();
                newkhnn.thanhTien = newkhnn.tTien();
                kh[countKH] = newkhnn;
                tong1 += newkhnn.soLuong;
                tongtien += newkhnn.thanhTien;
                dem++;
            }
            countKH++;
        }
    }

    public void in() {
        for (int i = 0; i < countKH; i++) {
            System.out.println("STT: " + (i + 1));
            System.out.println(kh[i].toString());
        }
    }

    public void tinhTongSL() {
        System.out.println("Tong SL (KW) cua KHVN: " + tong1);
        System.out.println("Tong SL (KW) cua KHNN: " +tong2);
    }
    
    public void tinhTrungBinh(){
        System.out.println("Trung binh thanh tien cua KHNN: " +(tongtien/dem));
    }
    
    public void thongTinSV(){
        System.out.println("Ten: Luu Thy Thy");
        System.out.println("MSSV: 1050080078");
        System.out.println("Lop: 10DH_CNTT2");
    }
}
