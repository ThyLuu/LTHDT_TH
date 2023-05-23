/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args){
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        int chon;
        
        do{
            System.out.println("=== MENU ===");
            System.out.println("1. Them KHVN");
            System.out.println("2. Them KHNN");
            System.out.println("3. In danh sach KH");
            System.out.println("4. Tinh tong thanh tien cua KHNN");
            System.out.println("5. Thoat");
            System.out.println("6. Thong tin SV");
            System.out.println("=== === ===");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            
            switch(chon){
                case 1:
                    ql.them(1);
                    break;
                case 2:
                    ql.them(2);
                    break;    
                case 3:
                    ql.in();
                    break; 
                case 4:
                    ql.tinhTrungBinh();
                    break; 
                case 5:
                    break; 
                case 6:
                    ql.thongTinSV();
                    break;   
                default:
                    System.out.println("Loi, lua chon khong hop le");
            }
        }while(chon != 0);
    }
}
