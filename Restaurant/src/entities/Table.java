/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.Enum.TableStatus;

/**
 *
 * @author Isaac Duarte
 */
public class Table {
    private Integer tableNumber;
    private Integer capacity;
    private TableStatus status;

    public Table() {
    }

    public Table(Integer tableNumber, Integer capacity, TableStatus status) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.status = status;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }
    
    public void reserve(Integer number){
        this.tableNumber = number;
        status.valueOf("RESERVED");
    }
    
    public void cancelReserve(Integer number){
        this.tableNumber = null;
        status.valueOf("AVALIABLE");
    }
}
