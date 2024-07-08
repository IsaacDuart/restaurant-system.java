/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.Enum.Office;

/**
 *
 * @author Isaac Duarte
 */
public class Employee {
   private String name;
   private Office office;
   private Double salary;

    public Employee() {
    }

    public Employee(String name, Office office, Double salary) {
        this.name = name;
        this.office = office;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
   
    public void work(){
        if(office.equals("WAITER")){
           
        }
    }
   
}
