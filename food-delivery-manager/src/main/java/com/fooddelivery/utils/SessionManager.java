package com.fooddelivery.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fooddelivery.entities.Customer;


public class SessionManager {

    public static SessionFactory sf;

    static{

        sf = new Configuration()
                            .addAnnotatedClass(Customer.class)
                            .configure()
                            .buildSessionFactory();
        
    }

    public static SessionFactory getSession(){
        return sf;
    }
    
}
