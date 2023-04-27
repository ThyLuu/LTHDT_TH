/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String MaSv;
    private String Hoten;

    public SinhVien() {
    }

    public SinhVien(String MaSv, String Hoten) {
        this.MaSv = MaSv;
        this.Hoten = Hoten;
    }

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String MaSv) {
        this.MaSv = MaSv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String toString() {
        return "SinhVien{" + "MaSv=" + MaSv + ", Hoten=" + Hoten + '}';
    }

    
}
