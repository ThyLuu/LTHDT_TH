/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1a;

/**
 *
 * @author Administrator
 */
public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thue;

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            thue = triGia * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200) {
            thue = triGia * 0.03;
        } else {
            thue = triGia * 0.05;
        }
        return thue;
    }
    
    public void Xuat(){
        System.out.format("%-20s %-20s %-20d %-20f %-20f \n",
                tenChuXe, loaiXe, dungTich, triGia, thue);
    }

}
