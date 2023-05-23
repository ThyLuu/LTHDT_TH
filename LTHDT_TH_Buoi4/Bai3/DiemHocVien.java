/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Administrator
 */
public class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private double demM1, demM2, demM3, demM4, demM5;

    public DiemHocVien() {
    }

    public DiemHocVien(String hoTen, int namSinh, double demM1, double demM2, double demM3, double demM4, double demM5) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.demM1 = demM1;
        this.demM2 = demM2;
        this.demM3 = demM3;
        this.demM4 = demM4;
        this.demM5 = demM5;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDemM1() {
        return demM1;
    }

    public void setDemM1(double demM1) {
        this.demM1 = demM1;
    }

    public double getDemM2() {
        return demM2;
    }

    public void setDemM2(double demM2) {
        this.demM2 = demM2;
    }

    public double getDemM3() {
        return demM3;
    }

    public void setDemM3(double demM3) {
        this.demM3 = demM3;
    }

    public double getDemM4() {
        return demM4;
    }

    public void setDemM4(double demM4) {
        this.demM4 = demM4;
    }

    public double getDemM5() {
        return demM5;
    }

    public void setDemM5(double demM5) {
        this.demM5 = demM5;
    }
    
    public double tinhDTB(){
        return (demM1 + demM2 + demM3 + demM4 + demM5) / 5;
    }
}
