package com.SpringCrud.SpringAngular.Entity;


import jakarta.persistence.Table;

@Table(name = "customer")
public class Customer {

    private  int customerid;
    private String customername;
    private int mobile;

    public Customer(int customerid, String customername, int mobile) {
        this.customerid = customerid;
        this.customername = customername;
        this.mobile = mobile;
    }

    public Customer() {
    }


    

}
