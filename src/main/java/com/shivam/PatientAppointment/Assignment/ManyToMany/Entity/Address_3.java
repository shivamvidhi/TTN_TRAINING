package com.shivam.PatientAppointment.Assignment.ManyToMany.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address_3 {
    String street;
    String location;
    String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
