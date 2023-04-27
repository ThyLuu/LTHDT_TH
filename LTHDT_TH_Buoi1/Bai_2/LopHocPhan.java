/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

/**
 *
 * @author Administrator
 */
public class LopHocPhan extends SinhVien{
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    private SinhVien[] dsSinhVien = new SinhVien[0];

    public LopHocPhan() {
    }

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, String MaSv, String Hoten) {
        super(MaSv, Hoten);
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongTinLopHoc() {
        return thongTinLopHoc;
    }

    public void setThongTinLopHoc(String thongTinLopHoc) {
        this.thongTinLopHoc = thongTinLopHoc;
    }

    public SinhVien[] getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(SinhVien[] dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    @Override
    public String toString() {
        return "LopHocPhan{" + "maLHP=" + maLHP + ", tenLHP=" + tenLHP + ", tenGV=" + tenGV + ", thongTinLopHoc=" + thongTinLopHoc + ", dsSinhVien=" + dsSinhVien + '}';
    }

    
}
