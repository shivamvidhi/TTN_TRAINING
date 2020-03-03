package com.shivam.firstspring.LooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan(basePackageClasses = adminUser.class)
public class Main
{
    @Autowired
    private User user;


    // 1. setter injection = No Setter Injection
    public void setUser(User user) {
        this.user = user;
    }

    // 2. constructor injection .....used for mandatory dependencies.
    private Main(User user) {
        super();
        this.user = user;
    }

    //
//    public void main(String[] args) {
//
//         Loose Coupling
//         display(new adminUser());
//         display(new normalUser());
//
//    }
//    public static void display(User u)
//    {
//        u.Dosomething();
//    }
    public void main()
    {
        user.Dosomething();
        //System.out.println(user);
    }

}