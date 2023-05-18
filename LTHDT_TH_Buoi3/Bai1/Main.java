/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale local = new Locale("vi", "VN");
        NumberFormat fm = NumberFormat.getCurrencyInstance(local);
        Order od = new Order(1, LocalDate.now());
        ArrayList<OrderDetail> odd = new ArrayList<>();
        OrderDetail ordd = new OrderDetail();

        Product p1 = new Product("Nuoc tuong", "sp1", 8000);
        Product p2 = new Product("Gao", "sp2", 18000);
        Product p3 = new Product("Duong", "sp3", 10000);
        Product p4 = new Product("Gao", "sp4", 18000);
        Product p5 = new Product("Muoi", "sp5", 5000);
        Product p6 = new Product("Bot ngot", "sp5", 7000);
        Product p7 = new Product("Nuoc mam", "sp5", 25000);

        OrderDetail o1 = new OrderDetail(p1, 10);
        OrderDetail o2 = new OrderDetail(p2, 5);
        OrderDetail o3 = new OrderDetail(p3, 1);
        OrderDetail o4 = new OrderDetail(p4, 1);
        OrderDetail o5 = new OrderDetail(p5, 4);
        OrderDetail o6 = new OrderDetail(p6, 7);
        OrderDetail o7 = new OrderDetail(p7, 5);

        od.addLineItems(p1, o1.getQuatity());
        od.addLineItems(p2, o2.getQuatity());
        od.addLineItems(p3, o3.getQuatity());
        od.addLineItems(p4, o4.getQuatity());
        od.addLineItems(p5, o5.getQuatity());
        od.addLineItems(p6, o6.getQuatity());
        od.addLineItems(p7, o7.getQuatity());

//        Xuat
        System.out.println("Ma HD: " + 01);
        System.out.println("Ngay lap HD: " + od.getOrderDate());

        System.out.format("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s \n",
                "STT",
                "Ma SP ",
                "Mo ta ",
                "Don gia ",
                "So luong ",
                "Thanh tien "
        );

        for (OrderDetail x : od.lineItems) {
            System.out.format("%-20s | %-20s | %-20s | %-20s | %-20s | %-20s \n",
                    odd.indexOf(x) + 1,
                    x.getProduct().getProductID(),
                    x.getProduct().getDescription(),
                    x.getProduct().getPrice(),
                    x.getQuatity(),
                    fm.format(x.calcTotalPrice())
            );
        }
        System.out.println("Tong tien thanh toan: " +fm.format(od.calcTotalChange()));

    }
}
