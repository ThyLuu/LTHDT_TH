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
public class CD {
    private long maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
    }

    public CD(long maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public long getMaCD() {
        return maCD;
    }

    public void setMaCD(long maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        } else {
            this.maCD = 999999;
        }

    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD != "") {
            this.tuaCD = tuaCD;
        } 
        else {
            this.tuaCD = "Chua xac dinh";
        }
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD{" + "maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + giaThanh + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma CD: ");
        maCD = sc.nextLong();
        setMaCD(maCD);
        System.out.printf("Nhap tua CD: ");
        sc.nextLine();
        tuaCD = sc.nextLine();
        setTuaCD(tuaCD);

        do {
            System.out.printf("Nhap so bai hat: ");
            soBaiHat = sc.nextInt();
            if (soBaiHat < 0) {
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        } while (soBaiHat <= 0);
        
        do {
            System.out.print("Nhap gia CD: ");
            giaThanh = sc.nextDouble();
            if (giaThanh < 0) {
                System.out.printf("Khong hop le! Nhap lai:  ");
            }
        } while (giaThanh < 0);
    }

}
