/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Isaac Duarte
 */
public class Adress {
    private String street;
    private Integer number;
    private String adressComplement;
    private String zipCode;
    private String city;

    public Adress() {
    }

    public Adress(String street, Integer number, String adressComplement, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.adressComplement = adressComplement;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAdressComplement() {
        return adressComplement;
    }

    public void setAdressComplement(String adressComplement) {
        this.adressComplement = adressComplement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  street + ", " + number + ", " + adressComplement + " - " + zipCode + ", " + city;
    }
    
    
}
