package com.shivam.jpapart2.ComponentMapping;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {


    String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Address()
    {

    }
}
