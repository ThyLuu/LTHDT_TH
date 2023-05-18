/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Administrator
 */
public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail() {
    }

    public OrderDetail(Product product, int quatity) {
        this.quatity = quatity;
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double calcTotalPrice(){
        double thanhTien = quatity * product.getPrice();
        return thanhTien;        
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quatity=" + quatity + ", product=" + product + '}';
    }
}
