/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLy {
    List<Vehicle> xe = new ArrayList<>();
    Scanner nhap = new Scanner(System.in);
    int chon;

    public void Menu(){
        do{
            System.out.println("===========================");
            System.out.println("1. Nhap thong tin xe");
            System.out.println("2. Xuat ban ke tien thue");
            System.out.println("3. Thoat");
            System.out.println("===========================");
            System.out.print("Hay chon: ");
            chon = nhap.nextInt();
            
            switch(chon){
                case 1:
                    them();
                    break;
                case 2:
                    hien();
                    break; 
                case 3:
                    
                    break;    
                default:
                    System.out.println("Hay nhap lai");
            }
        }while(chon != 3);
    }
    
    public void them(){
        System.out.println("=== NHAP ===");
        System.out.print("So luong xe can nhap: ");
        int n = nhap.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("Nhap thong tin xe thu %d \n", i);
            System.out.print("Nhap ten chu xe: ");
            nhap.nextLine();
            String tenChuXe = nhap.nextLine();
            System.out.print("Nhap loai xe: ");
            String loaiXe = nhap.nextLine();
            System.out.print("Nhap dung tich: ");
            int dungTich = nhap.nextInt();
            System.out.print("Nhap tri gia: ");
            double triGia = nhap.nextDouble();
            Vehicle v = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
            v.tinhThue();
            xe.add(v);
        }
    }
    
    public void hien(){
        Vehicle v = new Vehicle();
        System.out.format("%-20s %-20s %-20s %-20s %-20s \n", 
                "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        System.out.print("======================================================================================================= \n");
        for(Vehicle x : xe){
            x.Xuat();
        }
        
    }
}
