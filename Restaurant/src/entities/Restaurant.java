/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac Duarte
 */
public class Restaurant {
    private String restaurantName;
    private Adress adress;
    
    List<Table> tables = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(String restaurantName, Adress adress) {
        this.restaurantName = restaurantName;
        this.adress = adress;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Table> getTables() {
        return tables;
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }

    
    
}
