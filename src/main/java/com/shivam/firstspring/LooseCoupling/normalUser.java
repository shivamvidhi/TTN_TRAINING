package com.shivam.firstspring.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class normalUser implements User{

    @Override
    public void Dosomething() {
        System.out.println("I'm in the normal User Class");
    }
}