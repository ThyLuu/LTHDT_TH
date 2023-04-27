/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1b;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            HangThucPham tp1 = new HangThucPham();
            boolean kt = true;
            boolean th = true;
            System.out.print("Nhap ma hang : ");
            tp1.setMaHang(scanner.nextInt());
            scanner.nextLine();
            do {
                System.out.print("Nhap ten hang : ");
                tp1.setTenHang(scanner.nextLine());
            } while (tp1.kiemTraTenHang(kt));
            System.out.print("Nhap don gia : ");
            tp1.setDonGia(scanner.nextDouble());
            do {
                System.out.print("Nhap nam,thang,ngay san xuat : ");
                tp1.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                System.out.print("Nhap nam,thang,ngay het han : ");
                tp1.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                System.out.print("Nhap ghi chu : ");
                scanner.nextLine();
                tp1.setGhiChu(scanner.nextLine());
            } while (tp1.kiemTraNgay(th));
            System.out.println(tp1);
            tp1.kiemTraNgayHH();
        }
    }
}

