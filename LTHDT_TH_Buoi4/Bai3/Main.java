/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Main {

    static public void main(String[] args) {
        ArrayList<DiemHocVien> dhv = new ArrayList<>();
        dhv.add(new DiemHocVien("A", 2000, 6.7, 9.0, 7.5, 9.0, 9.0));
        dhv.add(new DiemHocVien("B", 2000, 5.0, 6.5, 8.0, 7.8, 7.6));
        dhv.add(new DiemHocVien("C", 2000, 9.0, 9.0, 9.0, 9.0, 9.0));
        dhv.add(new DiemHocVien("D", 2000, 5.0, 4.0, 5.6, 7.0, 2.0));
        dhv.add(new DiemHocVien("D", 2000, 6.0, 4.0, 9.0, 7.0, 6.0));
        dhv.add(new DiemHocVien("D", 2000, 6.7, 5.0, 8.7, 6.2, 4.8));

        int soLuanVanTN = 0, soThiTN = 0, soThiLai = 0;
        ArrayList<String> thiLai = new ArrayList<>();

        for (DiemHocVien x : dhv) {
            double dtb = x.tinhDTB();
            boolean duoi5 = true;

//            Luan Van TN
            if (dtb >= 7) {
                if (x.getDemM1() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM2() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM3() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM4() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM5() > 5) {
                    duoi5 = false;
                }
                if(duoi5 == false){
                    soLuanVanTN++;
                }
            }

//            Thi TN
            if (dtb < 7) {
                if (x.getDemM1() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM2() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM3() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM4() > 5) {
                    duoi5 = false;
                }
                if (x.getDemM5() > 5) {
                    duoi5 = false;
                }
                if(duoi5 == false){
                    soThiTN++;
                }
            }

            if (x.getDemM1() < 5) {
                duoi5 = true;
                System.out.println("Thi lai mon 1");
            }
            if (x.getDemM2() < 5) {
                duoi5 = true;
                System.out.println("Thi lai mon 2");
            }
            if (x.getDemM3() < 5) {
                duoi5 = true;
                System.out.println("Thi lai mon 3");
            }
            if (x.getDemM4() < 5) {
                duoi5 = true;
                System.out.println("Thi lai mon 4");
            }
            if (x.getDemM5() < 5) {
                duoi5 = true;
                System.out.println("Thi lai mon 5");
            }
            if(duoi5 == true){
                soThiLai++;
            }
        }
        
        System.out.println("So luan van TN: " +soLuanVanTN);
        System.out.println("So thi TN: " +soThiTN);
        System.out.println("So thi lai: " +soThiLai);
    }
}
