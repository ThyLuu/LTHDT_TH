/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class AccountList {
    ArrayList<Account> accList = new ArrayList<>();
    private int count;
    Scanner sc = new Scanner(System.in);
    int chon;

    public AccountList() {
        this.accList = new ArrayList<>(10);
        this.count = 0;
    }

    public AccountList(int n) {
        this.accList = new ArrayList<>(n);
        this.count = 0;
    }

    public void Them() {
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin tai khoan thu " + i + ": ");
            a = new Account();
            a.Nhap();
            accList.add(a);
        }
    }

    public void Hien() {
        Account a = new Account();
        System.out.format("%-20s %-20s %-20s \n", "Ten tai khoan", "So tai khoan", "So tien");
        System.out.print("================================================================================== \n");
        for (Account acc : accList) {
            acc.Xuat();
        }
    }

    public void Xoa() {
        int soTK = 0;
        Iterator<Account> iterator = accList.iterator();
        while (iterator.hasNext()) {
            Account acc = iterator.next();
            if (acc.getSoTK() == soTK) {
                iterator.remove();
                System.out.println("Da xoa tai khoan: " + soTK);
                return;
            }
        }
        System.out.println("Khong tim thay tai khoan " + soTK);
    }

    public void Tim() {
        int soTK = 0;
        for (Account a : accList) {
            if (a.getSoTK() == soTK) {
                System.out.println("Tai khoan can tim: " + a.toString());
            }
        }
    }

    public int soLuong() {
        return accList.size();
    }

    public void napTien() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        System.out.printf("Nhap so tien nap vao: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.printf("Khong hop le! nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                acc.setSoTien(acc.getSoTien() + soTien);
                System.out.println("Nap tien thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        System.out.printf("Nhap so tien can rut: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.printf("Khong hop le! nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                if (acc.getSoTien() >= soTien) {
                    acc.setSoTien(acc.getSoTien() - soTien);
                    System.out.println("Rut tien thanh cong");
                } else {
                    System.out.println("So tien khong du!");
                }
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void chuyenKhoan() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        System.out.printf("Nhap so tai khoan ban muon chuyen khoan: ");
        int stk2 = sc.nextInt();
        System.out.printf("Nhap so tien ban muon chuyen: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.printf("Khong hop le! nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                acc.setSoTien(acc.getSoTien() - soTien);
                System.out.println("Chuyen tien thanh cong");
            }

        }
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk2) {
                acc.setSoTien(acc.getSoTien() + soTien);
                return;
            }

        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void daoHan() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                acc.setSoTien(acc.getSoTien() + acc.getSoTien() * acc.laiSuat);
                System.out.println("Dao han thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void Menu() {
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Them tai khoan");
            System.out.println("2. So tai khoan hien co");
            System.out.println("3. In thong tin tat ca tai khoan");
            System.out.println("4. Nap tien");
            System.out.println("5. Rut tien");
            System.out.println("6. Chuyen tien");
            System.out.println("7. Thoat");
            System.out.println("=== === ===");
            System.out.print("Hay chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    Them();
                    break;
                case 2:
                    Hien();
                    break;
                case 3:
                    Xoa();
                    break;
                case 4:
                    napTien();
                    break;
                case 5:
                    rutTien();
                    break;
                case 6:
                    chuyenKhoan();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Hay nhap lai");
            }
        } while (chon != 6);
    }
}
