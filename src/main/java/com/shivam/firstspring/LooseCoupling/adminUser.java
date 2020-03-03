package com.shivam.firstspring.LooseCoupling;

import org.springframework.stereotype.Component;

@Component
public class adminUser implements User{

    @Override
    public void Dosomething() {
        System.out.println("I'm in the Admin User Class");
    }
}