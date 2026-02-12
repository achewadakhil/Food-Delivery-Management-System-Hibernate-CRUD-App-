package com.fooddelivery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer c1 = new Customer();

        c1.setId(1);
        c1.setName("Akhil");

        SessionFactory sf = new Configuration()
                            .addAnnotatedClass(Customer.class)
                            .configure()
                            .buildSessionFactory();
        Session session = sf.openSession();

        
        
        session.persist(c1);
        
        Transaction tx = session.beginTransaction();
        tx.commit();
        sf.close();
        session.close();
        System.out.println(c1);
    }
}
