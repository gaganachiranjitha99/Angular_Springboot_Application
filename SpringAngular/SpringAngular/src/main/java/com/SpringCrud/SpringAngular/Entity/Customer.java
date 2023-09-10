package com.SpringCrud.SpringAngular.Entity;


import jakarta.persistence.*;

@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int customerid;


    private String customername;
    private  String customeraddress;
    private int mobile;

    public Customer(int customerid, String customername, String customeraddress, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public Customer() {
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }
}
