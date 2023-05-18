/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Order {
    private int orderID;
    private LocalDate orderDate;
    ArrayList<OrderDetail> lineItems = new ArrayList<>();
    private int count;

    public Order() {
    }

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
    public void addLineItems(Product p, int q){
        lineItems.add(new OrderDetail(p, q));
    }
    
    public double calcTotalChange(){
        double thanhTien = 0;
        for (OrderDetail odd : lineItems){
            thanhTien += odd.calcTotalPrice();
        }
        return thanhTien;
    }
    
    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", count=" + count + '}';
    }
    
    
}
