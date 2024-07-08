/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.Enum.OrderStatus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac Duarte
 */
public class Order {
    private String orderID;
    private Client clientOrder;
    private OrderStatus status;
    
    List<MenuItem> orderList = new ArrayList<>();

    public Order() {
    }

    public Order(String orderID, Client clientOrder, OrderStatus status) {
        this.orderID = orderID;
        this.clientOrder = clientOrder;
        this.status = status;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Client getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(Client clientOrder) {
        this.clientOrder = clientOrder;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<MenuItem> getOrderList() {
        return orderList;
    }

    public void addItem(MenuItem item){
        orderList.add(item);
    }
    
     public void removeItem(MenuItem item){
        orderList.remove(item);
    }
    
}
